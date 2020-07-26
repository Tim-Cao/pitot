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
      
### 
