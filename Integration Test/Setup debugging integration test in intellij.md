# Prerequisite
- Java
- Ant
- Git
- Nodejs
- liferay-intellij repo
- liferay-plugin
# Steps
- Execute `ant all` in source directory
- Execute `ant -f build-test.xml setup-testable-tomcat` in source directory to open the port of debugging
  - Assert `include-and-override=portal-developer.properties` in portal-ext.properties
- Execute `..\gradlew idea` in source/modules directory
- Execute `${/path/to/liferay-intellij}/intellij "$@"` via git bash in source directory
- Import project > Source folder > Gradle > Finish
- Execute `catalina.bat jpda run` in portal/tomcat/bin directory
- Add Configuration > + icon button > Remote > Set 8000 as port > Apply > Ok
- Click Debug button on the right upper workbar 
  - `Connected to the target VM, address: 'localhost:8000', transport: 'socket'`
# Debug in integration test
(e.g. FragmentEntryProcessorFreemarkerTest#testProcessFragmentEntryLinkHTMLWithConfiguration)
- Press double shift
- Type FragmentEntryProcessorFreemarkerTest
- Add break point in FragmentEntryProcessorFreemarkerTest.java
- Click green triangle button in the FragmentEntryProcessorFreemarkerTest.java
- Debug run
