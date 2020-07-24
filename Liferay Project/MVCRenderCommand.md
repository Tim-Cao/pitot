- An implementation of the MVCRenderCommand interface.

- A portlet render URL in your view layer.

- a Component that publishes the MVCRenderCommand service, with two properties.

## Expample

        @Component(
            immediate = true,
            property = {
               "javax.portlet.name=" + HelloWorldPortletKeys.HELLO_WORLD,
               "mvc.command.name=/hello/edit_entry"
            },
            service = MVCRenderCommand.class
        )
        public class EditEntryMVCRenderCommand implements MVCRenderCommand {
