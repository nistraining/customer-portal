<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Home</title>
</head>
<body>
<h1>Hello Customer!</h1>


<%
String name = (String) request.getAttribute("name");
%>

<h1>Name is : <%=name %></h1>

<%
List<String> item = (List<String>) request.getAttribute("i");
%>
<h1>Items are : <%=item %></h1>
</body>
</html>