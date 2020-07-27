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