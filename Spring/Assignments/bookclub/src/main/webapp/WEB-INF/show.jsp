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
		<div class="row">
			<h1><c:out value="${book.title}"></c:out></h1>
			<a href="/books">back to the shelves</a>
		</div>
		<div class="row">
			<p><c:out value="${book.creator.userName}"></c:out> read <c:out value="${book.title}"></c:out> by <c:out value="${book.author}"></c:out>.</p>
		</div>
		<div class="row">
			<p>Here are <c:out value="${book.creator.userName}"></c:out>'s thoughts:</p>
		</div>
		<div>
			<c:out value="${book.thoughts}"></c:out>
		</div>
	</div>
</body>
</html>