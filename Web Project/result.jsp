<%@ page import="java.util.List" %>
<%@ page import="com.liferay.training.servlet.BookInfo" %>
<html>
  <head>
    <title>Insert title here</title>
  </head>
    <body>
<%
List<BookInfo> bookInfos = (List<BookInfo>)request.getAttribute("bookInfos");
for (BookInfo bookInfo : bookInfos) {
%>
    <%= bookInfo %><br />
<%
}
%>
    </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
