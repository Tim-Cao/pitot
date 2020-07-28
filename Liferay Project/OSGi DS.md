## OSGi Declarative Services (DS) 声明式服务

- OSGi framework registers objects as services. 

  - Each service offers functionality and can leverage functionality other services provide. 

  - The OSGi Services model supports a collaborative environment for objects.

- Declarative Services (DS) provides a service component model on top of OSGi Services. 

  - DS service components are marked with the @Component annotation and implement or extend a service class.
  
  - Service components can refer to and use each other’s services.
  
  - The Service Component Runtime (SCR) registers component services and handles binding them to other components that reference them.

- Service registration: 

  - On installing a module that contains a service component, the SCR creates a component configuration that associates the component with its specified service type and stores it in a service registry.

- Service reference handling:

  - On installing a module whose service component references another service type, the SCR searches the registry for a component configuration that matches the service type and on finding a match binds an instance of that service to the referring component.

- OSGi implmentation provides the SCR implementation. SCR is part of OSGi environment.

- According OSGi, application is composed of bundles and each bundles have set of components.

- Components consist of services and these services performs some tasks.

## Reference 

- http://www.liferaysavvy.com/2017/09/osgi-declarative-services-ds.html

- http://www.liferaysavvy.com/2017/10/liferay-7-dxp-modularity-introduction.html
