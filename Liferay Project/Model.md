## Model: The model layer holds the application data and logic for manipulating it.

## Summary: Loose coupling

- The persistence layer saves and retrieves your model data.

- The service layer is a buffer between your application and persistence layers:

  - having it lets you swap out your persistence layer for a different implementation without modifying anything but the calls in the service layer.

- The model layer is in the model, while the service and persistence layers are in the service.

## Model Layer

- Model data

## Service Layer

- Both a local service implementation and a remote service implementation have been created for a particular service.

### Local Services

### Services (Remote Services)

- The remote service performs a permission check and then invokes the corresponding local service.

- **SOAP web services**

  - https://help.liferay.com/hc/en-us/articles/360018161151-SOAP-Web-Services-

- **JSON web services**: Usually use in Poshi

  - https://help.liferay.com/hc/en-us/articles/360018161111-Invoking-JSON-Web-Services-

## Persistence Layer

- Responsible for storing and retrieving application data. Insulate the business logic of the application from database. 

- Application’s persistence layer persists data represented by configured entities to a database. 

- In fact, local service implementation classes are responsible for calling the persistence layer to retrieve and store application’s data.

## Reference

- https://help.liferay.com/hc/en-us/articles/360017878572-Generating-Model-Service-and-Persistence-Layers
- https://help.liferay.com/hc/en-us/articles/360017882112-Invoking-Remote-Services
