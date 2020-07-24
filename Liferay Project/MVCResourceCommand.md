- The resource URL invokes the corresponding MVC resource command class (*MVCResourceCommand) 

  - that processes the resource request and response.


## Example

      @Component(
          immediate = true,
          property = {
              "javax.portlet.name=your_portlet_name_YourPortlet",
              "mvc.command.name=/your/jsp/resource/url"
          },
          service = MVCResourceCommand.class
      )
      public class YourMVCResourceCommand implements MVCResourceCommand {
          // your resource handling code
      }
