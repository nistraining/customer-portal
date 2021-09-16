<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
This is Help

<%
String name = (String) request.getAttribute("name");
LocalDateTime time= (LocalDateTime) request.getAttribute("time");
%>
<h1>Hello Customer: <%=name %>,How Can I Help You!</h1>
<h1>Current Time is : <%=time %></h1>
</body>
</html>