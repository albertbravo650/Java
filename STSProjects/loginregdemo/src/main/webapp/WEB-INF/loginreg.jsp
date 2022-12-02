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
    <title>Login Registration</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<h1>Welcome!</h1>
		<div class="row">
			<div class="col">
				<p class="fs-3">Register:</p>
				<form:form action="/register" method="post" modelAttribute="registerUser">
					<div class="row my-4">
						<form:label path="name" class="col-3">Name:</form:label>
						<form:input path="name" class="col-8"/>
						<form:errors path="name" class="text-danger offset-3"/>
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
						<form:label path="confirmPassword" class="col-3">Confirm Password:</form:label>
						<form:input type="password" path="confirmPassword" class="col-8"/>
						<form:errors path="confirmPassword" class="text-danger offset-3"/>
					</div>
					<input class="btn btn-primary" type="submit" value="Register">
					
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>