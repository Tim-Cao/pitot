## Tree Layers

- With Service Builder, the *model* layer is generated into a *service* and an *api* module. That accounts for the model in the MVC pattern. 

  - A module that publishes a portlet component with the necessary properties.

- The *view* and the *controller* share a module, the *web* module.

  - Controller code to handle the request and response.

  - JSPs to implement your view layer.

## Session

- If successful, the SessionMessages object is used to store a success message.

- If an exception is thrown, it’s caught, and the appropriate SessionErrors object is used to store the exception message.

## Reference

- https://help.liferay.com/hc/en-us/articles/360018164991-Liferay-MVC-Portlet
