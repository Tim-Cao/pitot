- init.jsp
```jsp
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.bookmarks.model.BookmarksFolder" %>   //Import class in init.jsp
```
- edit_entry.jsp
```jsp
<%@ include file="/bookmarks/init.jsp" %> 

<aui:input name="<%= Constants.CMD %>" type="hidden" />   //In edit_entry.jsp
```
- view.jsp
```jsp
<%@ include file="/bookmarks/init.jsp" %>      //Invoke init.jsp

<% BookmarksFolder folder = (BookmarksFolder)request.getAttribute(BookmarksWebKeys.BOOKMARKS_FOLDER); %>
```
