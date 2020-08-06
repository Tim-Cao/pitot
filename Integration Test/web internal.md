### Invoke methods from service implement class in web.internal package

- Implement Class

            package com.liferay.asset.list.web.internal.portlet.action;

             @Component(
              immediate = true,
              property = {
                "javax.portlet.name=" + AssetListPortletKeys.ASSET_LIST,
                "mvc.command.name=/asset_list/add_asset_list_entry"
              },
              service = MVCActionCommand.class
            )

- Integration Test Class

          ReflectionTestUtil.invoke(
              _mvcActionCommand, "doProcessAction",
              new Class<?>[] {ActionRequest.class, ActionResponse.class},
              mockLiferayPortletActionRequest, new MockActionResponse());


            @Inject(
              filter = "mvc.command.name=/asset_list/add_asset_list_entry"
            )
            private MVCActionCommand _mvcActionCommand;
                        
- Implement Class

          package com.liferay.journal.web.internal.info.item.provider;
          
          @Component(immediate = true, service = InfoItemObjectProvider.class)
            
- Integration Test class

          InfoItemObjectProvider<JournalArticle> journalArticleInfoItemProvider =
            (InfoItemObjectProvider<JournalArticle>)
              _infoItemServiceTracker.getFirstInfoItemService(
                InfoItemObjectProvider.class,
                JournalArticle.class.getName());        
          
          @Inject
          private InfoItemServiceTracker _infoItemServiceTracker;
          
          
- Inner Implement Class

          private static class TestInfoDisplayContributor
            implements InfoDisplayContributor<Object> {
    
- Integration Test Class
   
          _registerInfoDisplayContributor();

          InfoItemFormProvider<TestInfoDisplayContributor> infoItemFormProvider =
            (InfoItemFormProvider<TestInfoDisplayContributor>)
              _infoItemServiceTracker.getFirstInfoItemService(
                InfoItemFormProvider.class,
                TestInfoDisplayContributor.class.getName());
    
          private void _registerInfoDisplayContributor() {
            Registry registry = RegistryUtil.getRegistry();

            _serviceRegistration = registry.registerService(
              (Class<InfoDisplayContributor<?>>)
                (Class<?>)InfoDisplayContributor.class,
              new TestInfoDisplayContributor());
          }

          @Inject
          private InfoItemServiceTracker _infoItemServiceTracker;

          private ServiceRegistration<InfoDisplayContributor<?>> _serviceRegistration;
