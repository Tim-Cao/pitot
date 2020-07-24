## *MVCActionCommand class must also have a @Component annotation 

- Set the property *javax.portlet.name* to your portlet’s internal ID

- Set the property *mvc.command.name* to the value of the name property in your JSP’s matching actionURL.

- Set the service property to MVCActionCommand.class

  - To register the component in the OSGi container as using the MVCActionCommand class
