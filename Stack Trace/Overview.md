Exception Message

    2020-02-13 03:31:12.503 ERROR [http-nio-8080-exec-9][PortletServlet:119] javax.portlet.PortletException: org.apache.jasper.JasperException: java.lang.NullPointerException
    javax.portlet.PortletException: org.apache.jasper.JasperException: java.lang.NullPointerException
      
The top of stack trace is the innermost method.
  - PortletRequestDispatcherImpl.dispatch throw an expection.

The bottom of stack trace is the outermost method.

      at com.liferay.portlet.internal.PortletRequestDispatcherImpl.dispatch(PortletRequestDispatcherImpl.java:307)
      at com.liferay.portlet.internal.PortletRequestDispatcherImpl.include(PortletRequestDispatcherImpl.java:123)
      at com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet.include(MVCPortlet.java:572)
      ...
      at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
      at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
      at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)
      at java.lang.Thread.run(Thread.java:748)
    
Rethrow Exception

    Caused by: org.apache.jasper.JasperException: java.lang.NullPointerException
      at org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:440)
      at org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:473)
      at org.apache.jasper.servlet.JspServlet.service(JspServlet.java:377)
      at javax.servlet.http.HttpServlet.service(HttpServlet.java:741)
      at com.liferay.portal.osgi.web.servlet.jsp.compiler.internal.JspServlet.service(JspServlet.java:373)
      at com.liferay.portal.osgi.web.servlet.jsp.compiler.internal.JspServlet.service(JspServlet.java:385)
      at org.eclipse.equinox.http.servlet.internal.registration.EndpointRegistration.service(EndpointRegistration.java:153)
      at org.eclipse.equinox.http.servlet.internal.servlet.ResponseStateHandler.processRequest(ResponseStateHandler.java:62)
      at org.eclipse.equinox.http.servlet.internal.context.DispatchTargets.doDispatch(DispatchTargets.java:120)
      at org.eclipse.equinox.http.servlet.internal.servlet.RequestDispatcherAdaptor.include(RequestDispatcherAdaptor.java:48)
      at com.liferay.portlet.internal.PortletRequestDispatcherImpl.dispatch(PortletRequestDispatcherImpl.java:291)
      ... 226 more
    Caused by: java.lang.NullPointerException
      at org.apache.jsp.view_jsp._jspService(view_jsp.java:382)
      at org.apache.jasper.runtime.HttpJspBase.service(HttpJspBase.java:111)
      at javax.servlet.http.HttpServlet.service(HttpServlet.java:741)
      at org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:411)
      ... 236 more
