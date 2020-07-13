# Prerequisite
- Java
- Ant
- Git
- Nodejs
- liferay-intellij repo
- liferay-plugin (Not Required)
# Steps
- Execute `ant all` in source directory
- Execute `ant -f build-test.xml setup-testable-tomcat` in source directory to open the port of debugging (Not Required)
  - Assert `include-and-override=portal-developer.properties` in portal-ext.properties
- Execute `..\gradlew idea` in source/modules directory
- Execute `${/path/to/liferay-intellij}/intellij "$@"` via git bash in source directory
- Import project > Source folder > Gradle > Finish  (Not Required)
- Execute `catalina.bat jpda run` in portal/tomcat/bin directory
- Add Configuration > + icon button > Remote > Set 8000 as port > Apply > Ok
- Click Debug button on the right upper workbar 
  - `Connected to the target VM, address: 'localhost:8000', transport: 'socket'`
# Debug in integration test
`e.g. FragmentEntryProcessorFreemarkerTest#testProcessFragmentEntryLinkHTMLWithConfiguration`
- Press double shift
- Type `FragmentEntryProcessorFreemarkerTest`
- Open `FragmentEntryProcessorFreemarkerTest.java`
- Click cross sight icon button
- Right click the `*-test` folder
- Open in Terminal
- Execute `gw testIntegration --tests **FragmentEntryProcessorFreemarkerTest**`
# Optional
- Execute `gw testIntegration --tests **FragmentEntryProcessorFreemarkerTest.testProcessFragmentEntryLinkHTMLWithConfiguration` to run specific test
