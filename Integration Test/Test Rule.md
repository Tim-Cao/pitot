## Add new test rule via AggregateTestRule


        @ClassRule
        @Rule
        public static final AggregateTestRule aggregateTestRule =
          new AggregateTestRule(
            new LiferayIntegrationTestRule(),
            PermissionCheckerMethodTestRule.INSTANCE);



## Reference

- com.liferay.portal.test.rule package
