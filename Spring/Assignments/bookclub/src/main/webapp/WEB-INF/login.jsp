<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Club</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<h1>Book Club</h1>
		<p>A place for friends to share thoughts on books.</p>
		<div class="row">
			<div class="col">
				<p class="fs-3">Register</p>
				<form:form action="/register" method="post" modelAttribute="newUser">
					<div class="row my-4">
						<form:label path="userName" class="col-3">Name:</form:label>
						<form:input path="userName" class="col-8"/>
						<form:errors path="userName" class="text-danger offset-3"/>
					</div>
					<div class="row my-4">
						<form:label path="email" class="col-3">Email:</form:label>
						<form:input path="email" class="col-8"/>
						<form:errors path="email" class="text-danger offset-3"/>
					</div>
					<div class="row my-4">
						<form:label path="password" class="col-3">Password:</form:label>
						<form:input type="password" path="password" class="col-8"/>
						<form:errors path="password" class="text-danger offset-3"/>
					</div>
					<div class="row my-4">
						<form:label path="confirm" class="col-3">Confirm Password:</form:label>
						<form:input type="password" path="confirm" class="col-8"/>
						<form:errors path="confirm" class="text-danger offset-3"/>
					</div>
					<input class="btn btn-primary" type="submit" value="Register">
				</form:form>
			</div>
			<div class="col">
				<p class="fs-3">Login</p>
				<form:form action="/login" method="post" modelAttribute="loginUser">
					<div class="row my-4">
						<form:label path="loginEmail" class="col-3">Email:</form:label>
						<form:input path="loginEmail" class="col-8"/>
						<form:errors path="loginEmail" class="text-danger offset-3"/>
					</div>
					<div class="row my-4">
						<form:label path="loginPassword" class="col-3">Password:</form:label>
						<form:input type="password" path="loginPassword" class="col-8"/>
						<form:errors path="loginPassword" class="text-danger offset-3"/>
					</div>
					<input class="btn btn-primary" type="submit" value="Login">
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>