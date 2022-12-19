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
			<h1>Change your Entry</h1>
			<a href="/books">back to the shelves</a>
		</div>
		<div class="row">
			<div class="col">
				<form:form action="/books/${book.id}" method="post" modelAttribute="book">
					<input type="hidden" name="_method" value="put"/>
					<div class="row my-4">
						<form:label path="title" class="col-3">Title:</form:label>
						<form:input path="title" class="col-8"/>
						<form:errors path="title" class="text-danger offset-3"/>
					</div>
					<div class="row my-4">
						<form:label path="author" class="col-3">Author:</form:label>
						<form:input path="author" class="col-8"/>
						<form:errors path="author" class="text-danger offset-3"/>
					</div>
					<div class="row my-4">
						<form:label path="thoughts" class="col-3">My Thoughts:</form:label>
						<form:textarea path="thoughts" class="col-8"/>
						<form:errors path="thoughts" class="text-danger offset-3"/>
					</div>
					<form:input type="hidden" path="creator" value="${loggedUser.id}"/>
					<input class="btn btn-primary" type="submit" value="Submit">
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>