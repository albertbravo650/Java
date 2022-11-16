<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
	<h3>Login</h3>
	<p><c:out value="${error}"></c:out></p>
	<form action="/login" method="POST">
		<label>Email:</label>
		<input type="text" name="email">
		<label>Password:</label>
		<input type="password" name="password">
		<input type="submit" value="Log In">
	</form>
</body>
</html>