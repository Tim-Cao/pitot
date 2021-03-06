### How to register testClass as OGSi component in integration test?

      import com.liferay.registry.Registry;
      import com.liferay.registry.RegistryUtil;

      TestInfoDisplayContributor infoDisplayContributor =
        new TestInfoDisplayContributor();

      Registry registry = RegistryUtil.getRegistry();

      _serviceRegistration = registry.registerService(
        (Class<InfoDisplayContributor<?>>)
          (Class<?>)InfoDisplayContributor.class,
        infoDisplayContributor);

      private ServiceRegistration<InfoDisplayContributor<?>> _serviceRegistration;

      private static class TestInfoDisplayContributor
        implements InfoDisplayContributor<Object> {

        public TestInfoDisplayContributor() {
        }
      }
      
### What's the difference between the usage of org.osgi.util.tracker.ServiceTracker and com.liferay.info.item.InfoItemServiceTracker ?

- Service implementations that are registered in the OSGi service registry can be accessed using Service Trackers.

- org.osgi.util.tracker.ServiceTracker and com.liferay.registry.ServiceTracker are more generic utilities that look up services in the service registry.

- InfoItemServiceTracker is a tracker for services associated to an InfoItem


### What's the relationship between InfoDisplayContributor and InfoItemFormProvider and InfoItemObjectProvider ?

- InfoDisplayContributor is in charge of the logic for the display pages 

- InfoItemFormProvider is an implementation of part of the contributer, and also InfoItemObjectProvider

### Which class is the service impl of InfoItemFormProvider and InfoItemObjectProvider?

- InfoDisplayContributorWrapper

            public class InfoDisplayContributorWrapper
            implements InfoItemClassDetailsProvider<Object>,
                           InfoItemFieldValuesProvider<Object>,
                           InfoItemFormProvider<Object>,
                           InfoItemFormVariationsProvider<Object>,
                           InfoItemObjectProvider<Object> {

- InfoDisplayContributorWrapper is for backwards compatibility

  - To add new function and not affect the original interface
                           
### What's the difference between of getAllInfoItemServices and getFirstInfoItemService ?

- getAllInfoItemService get service impl object ArrayList

            @Override
            public <P> List<P> getAllInfoItemServices(
                  Class<P> serviceClass, String itemClassName) {

                  ServiceTrackerMap<String, List<P>> infoItemServiceTrackerMap =
                        (ServiceTrackerMap<String, List<P>>)
                              _itemClassNameInfoItemServiceTrackerMap.get(
                                    serviceClass.getName());

                  List<P> services = infoItemServiceTrackerMap.getService(itemClassName);

                  if (services != null) {
                        return new ArrayList<>(services);
                  }

                  return Collections.emptyList();
            }


- getFirstInfoItemService get specific service impl object

            @Override
            public <P> P getFirstInfoItemService(
                  Class<P> serviceClass, String itemClassName) {

                  List<?> infoItemServices = getAllInfoItemServices(
                        serviceClass, itemClassName);

                  if (ListUtil.isEmpty(infoItemServices)) {
                        return null;
                  }

                  return (P)infoItemServices.get(0);
            }
