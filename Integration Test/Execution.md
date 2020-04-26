## Client
Gradle deploy integration test to portal

Check the listening port

    com.liferay.layout.page.template.headless.delivery.dto.v1_0.test.PageDefinitionConverterUtilTest STANDARD_ERROR
        四月 26, 2020 6:37:53 上午 com.liferay.arquillian.extension.junit.bridge.client.FrameworkState connect
        信息: Unable to connect at 127.0.0.1:32763. retrying in 10s.

## Server

Start modules before Integration test

Deploy jars from osgi\test to osgi\modules

Start listening port

    2020-04-26 06:38:23.294 INFO  [fileinstall-D:/master/osgi/modules][BundleStartStopLogger:46] STARTED com.liferay.user.associated.data.test.util_6.0.2 [986]
    2020-04-26 06:38:23.295 INFO  [fileinstall-D:/master/osgi/modules][BundleStartStopLogger:46] STARTED com.liferay.portal.lpkg.deployer.test.util_4.0.3 [972]
    2020-04-26 06:38:23.295 INFO  [fileinstall-D:/master/osgi/modules][BundleStartStopLogger:46] STARTED com.liferay.petra.test.util_2.0.1 [968]
    2020-04-26 06:38:23.303 INFO  [fileinstall-D:/master/osgi/modules][ArquillianConnector:96] Listening on port 32763
    2020-04-26 06:38:23.305 INFO  [fileinstall-D:/master/osgi/modules][BundleStartStopLogger:46] STARTED com.liferay.arquillian.extension.junit.bridge.connector_1.0.1 [957]

## Server

Deploy Integration Test module

    2020-04-26 06:38:28.193 INFO  [Arquillian-Connector-Thread][BundleStartStopLogger:46] STARTED com.liferay.layout.page.template.test_1.0.0 [992]

Arquillian execute Tests

## Client
Print Test Results

    com.liferay.layout.page.template.headless.delivery.dto.v1_0.test.PageDefinitionConverterUtilTest > testToPageDefinitionRow STARTED

    com.liferay.layout.page.template.headless.delivery.dto.v1_0.test.PageDefinitionConverterUtilTest > testToPageDefinitionRow PASSED

    com.liferay.layout.page.template.headless.delivery.dto.v1_0.test.PageDefinitionConverterUtilTest > testToPageDefinitionSection STARTED

    com.liferay.layout.page.template.headless.delivery.dto.v1_0.test.PageDefinitionConverterUtilTest > testToPageDefinitionSection PASSED

## Server
Undeploy Integration Test module

    2020-04-26 06:38:42.098 INFO  [Arquillian-Connector-Thread][BundleStartStopLogger:49] STOPPED com.liferay.layout.page.template.test_1.0.0 [992]
