- ResourceActions.java defines the interface

		public interface ResourceActions {

	- Only public methods exist
- ResourceActionsImpl.java defines class implementing ResourceActions interface

		public class ResourceActionsImpl implements ResourceActions {

	- Both public methods and private methods exist

- The model-resource node only has 1 model-name node or 1 composite-model-name node.

- ReflectionTestUtil call private method

		modelName = ReflectionTestUtil.invoke(
			_resourceActions, "_getCompositeModelName",
			new Class<?>[] {Element.class},
			resourceElement.element("composite-model-name"));
