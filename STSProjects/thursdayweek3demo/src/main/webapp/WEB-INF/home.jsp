<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic Form</title>
</head>
<body>
	<form action="/processform" method="POST">
		<p><c:out value="${usernameMessage}"/></p>
		<div>
			<label for="username">User name:</label>
			<input type="text" name="username" id="username"/>
		</div>
		<div>
			<label for="email">Email:</label>
			<input type="email" name="email" id="email"/>
		</div>
		<div>
			<label for="age">Age:</label>
			<input type="number" name="age" id="age"/>
		</div>
		<div>
			<label for="password">Password:</label>
			<input type="password" name="password" id="password"/>
		</div>
		<div>
			<input type="submit" value="Submit" id="submit"/>
		</div>
	</form>

</body>
</html>