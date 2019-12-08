/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.bookmarks.service.impl;

/**
 * @author Brian Wing Shun Chan
 * @author Raymond Augé
 * @author Levente Hudák
 */
@Component(
	property = "model.class.name=com.liferay.bookmarks.model.BookmarksEntry",
	service = AopService.class
)
public class BookmarksEntryLocalServiceImpl
	extends BookmarksEntryLocalServiceBaseImpl {

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BookmarksEntry addEntry(
			long userId, long groupId, long folderId, String name, String url,
			String description, ServiceContext serviceContext)
		throws PortalException {

		// Entry

		User user = userLocalService.getUser(userId);

		if (Validator.isNull(name)) {
			name = url;
		}

		validate(url);

		long entryId = counterLocalService.increment();

		BookmarksEntry entry = bookmarksEntryPersistence.create(entryId);

		entry.setUuid(serviceContext.getUuid());
		entry.setGroupId(groupId);
		entry.setCompanyId(user.getCompanyId());
		entry.setUserId(user.getUserId());
		entry.setUserName(user.getFullName());
		entry.setFolderId(folderId);
		entry.setTreePath(entry.buildTreePath());
		entry.setName(name);
		entry.setUrl(url);
		entry.setDescription(description);
		entry.setExpandoBridgeAttributes(serviceContext);

		entry = bookmarksEntryPersistence.update(entry);

		// Resources

		resourceLocalService.addModelResources(entry, serviceContext);

		// Asset

		updateAsset(
			userId, entry, serviceContext.getAssetCategoryIds(),
			serviceContext.getAssetTagNames(),
			serviceContext.getAssetLinkEntryIds(),
			serviceContext.getAssetPriority());

		// Social

		JSONObject extraDataJSONObject = JSONUtil.put("title", entry.getName());

		socialActivityLocalService.addActivity(
			userId, groupId, BookmarksEntry.class.getName(), entryId,
			BookmarksActivityKeys.ADD_ENTRY, extraDataJSONObject.toString(), 0);

		// Subscriptions

		notifySubscribers(userId, entry, serviceContext);

		return entry;
	}

	@Reference
	private ConfigurationProvider _configurationProvider;

	@Reference
	private SubscriptionLocalService _subscriptionLocalService;

	@Reference
	private TrashEntryLocalService _trashEntryLocalService;

	@Reference
	private TrashVersionLocalService _trashVersionLocalService;

	@Reference
	private ViewCountManager _viewCountManager;

}
