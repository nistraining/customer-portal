<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
<h1>Welcome, ${user.username}</h1>
<h1>Your Registration is successful with , ${user.email}</h1>
<h1>Your password is ${user.password}, please do not share it with anyone.</h1>
</body>
</html>