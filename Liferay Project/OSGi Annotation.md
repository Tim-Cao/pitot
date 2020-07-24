# Declarative Services（DS） annotation 声明式服务标签

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

- @Reference annotations are going to be ignored in non-components, and in fact they are also ignored in subclasses too.
  
- unbind: There is no method to call when the component is unbinding.
  
- target: Target is used as a filter mechanism
  
- cardinality: 
    - ReferenceCardinality.MANDITORY: The reference must be available and injected before this component will start.
- policy:
    -  ReferencePolicy.STATIC: The component will only be started when there is an assigned reference, and will not be notified of alternative services as they become available.
- policyOption:
    - ReferencePolicyOption.RELUCTANT: For single reference cardinality, new reference potentials that become available will be ignored.  For multiple reference cardinality, new reference potentials will be bound.

## Reference

- https://liferay.dev/blogs/-/blogs/liferay-osgi-annotations-what-they-are-and-when-to-use-them
