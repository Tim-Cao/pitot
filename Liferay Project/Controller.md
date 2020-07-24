## Controller: The middle man in the MVC pattern, the Controller contains logic for passing the data back and forth between the view and the model layers.

- In MVC, your controller receives requests from the front-end, and it pulls data from the back-end. It’s a traffic director: 

      It provides data to the right front-end view for display to the user,
      
      and it takes data the user entered in the front-end and passes it to the right back-end service. 

      For this reason, the controller must process requests from the front-end,
      
      and it must determine the right front-end view to pass data back to the user.

The middle man in the MVC pattern, the Controller contains logic for passing the data back and forth between the view and the model layers.

## Small Applications

- If you have a small application that’s not heavy on controller logic (maybe just a couple of action methods),

- you can put all your controller code in the -Portlet class.

## Large Applications

- MVCActionCommand:

      Use -ActionCommand classes to hold each of your portlet actions, which are invoked by action URLs.

- MVCRenderCommand:

      Use -RenderCommand classes to hold a render method that dispatches to the appropriate JSP, by responding to render URLs.

- MVCResourceCommand:

      Use -ResourceCommand classes to execute resource serving in your MVC portlet, by responding to resource URLs.

## Reference

- https://help.liferay.com/hc/en-us/articles/360018165031-Writing-Controller-Code
