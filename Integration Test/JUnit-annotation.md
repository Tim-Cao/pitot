com.liferay.arquillian

	package com.liferay.journal.util.test;

	import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;

@RunWith(Arquillian.class) marks the class for Arquillian to execute.

	@RunWith(Arquillian.class)
	public class JournalTestUtilTest {

@Inject uses reflection to inject a field with a service component object matching the field’s interface.
Test rule LiferayIntegrationTestRule provides the annotation.

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();
  
LiferayIntegrationTestRule

	public class LiferayIntegrationTestRule extends AggregateTestRule {
  
	    public LiferayIntegrationTestRule() {
	      super(false, _getTestRules());
	    }

	    private static TestRule[] _getTestRules() {
	      List<TestRule> testRules = new ArrayList<>();

	      if (System.getenv("JENKINS_HOME") != null) {
		testRules.add(TimeoutTestRule.INSTANCE);
	      }

	      testRules.add(LogAssertionTestRule.INSTANCE);
	      testRules.add(SybaseDumpTransactionLogTestRule.INSTANCE);
	      testRules.add(ClearThreadLocalClassTestRule.INSTANCE);
	      testRules.add(UniqueStringRandomizerBumperClassTestRule.INSTANCE);
	      testRules.add(DestinationAwaitClassTestRule.INSTANCE);
	      testRules.add(CompanyProviderClassTestRule.INSTANCE);
	      testRules.add(DeleteAfterTestRunMethodTestRule.INSTANCE);
	      testRules.add(SynchronousDestinationTestRule.INSTANCE);
	      testRules.add(InjectTestRule.INSTANCE);

	      return testRules.toArray(new TestRule[0]);
	    }

	  }

@Test designates the testAddArticleWithDDMStructureAndDDMTemplate method as a test. 

	@Test
	public void testAddArticleWithDDMStructureAndDDMTemplate()
		throws Exception {    

@Inject annotation to inject service components into an integration test
Like use @Reference annotation to inject service components into an OSGi component
  
 	 @Inject
 
The Liferay Arquillian Extension injects the _sampleService field with a SampleService implementation
(i.e., a SampleServiceImpl instance).
The container injects static fields once before test runs and nulls them after all tests run. 
Non-static fields are injected before each test run but stay in memory till all tests finish.

  	private SampleService _sampleService;
