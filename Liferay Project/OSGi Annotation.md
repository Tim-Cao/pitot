## OSGi (Open Services Gateway initiative) : OSGi is a component framework for Java. The Dynamic Module System for Java

  - Developing with OSGi technology means developing bundles: the OSGi components. Bundles are modules.
  
  - Components communicate locally and across the network through services.


## @Components: defining a service implementation. 

- immediate
- properties
- service

- Whenever you create a component that you want or need to publish into the OSGi container. 

## @Reference

This is the counterpart to the @Component annotation.  @Reference is used to get OSGi to inject a component reference into your component.

It is only going to work on an OSGi @Component class.  
  @Reference annotations are going to be ignored in non-components, and in fact they are also ignored in subclasses too.
  
  - unbind: There is no method to call when the component is unbinding.
  
  - target: Target is used as a filter mechanism

## Reference

- https://liferay.dev/blogs/-/blogs/liferay-osgi-annotations-what-they-are-and-when-to-use-them
