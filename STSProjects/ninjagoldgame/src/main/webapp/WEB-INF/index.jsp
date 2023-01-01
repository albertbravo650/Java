<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>Ninja Gold Game</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="header">
				<h3>Your Gold: <c:out value="${gold}"></c:out></h3>
			</div>
		</div>
		<div class="row">
			<div class="col box">
				<h3>Farm</h3>
				<p>(earns 10-20 gold)</p>
				<form action="/action" method="post">
					<input type="hidden" name="farmGold">
					<input type="submit" value="Find Gold!">
				</form>
			</div>
			<div class="col box">
				<h3>Cave</h3>
			</div>
			<div class="col box">
				<h3>House</h3>
			</div>
			<div class="col box">
				<h3>Quest</h3>
			</div>
		</div>
		<div class="row">
			<h3>Activities:</h3>
		</div>
		<div class="row log">
		</div>
	</div>	
</body>
</html>

