<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>University App</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<p>This is the all universities page.</p>
	<div class="container-fluid">
		<h1>All universities</h1>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>University name</th>
					<th>City</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="university" items="${universities}">
					<tr>
						<td><c:out value="${university.id}"></c:out></td>
						<td><a href="/universities/${university.id}"><c:out value="${university.name}"/></a></td>
						<td><c:out value="${university.city}"></c:out></td>
						<td><a href="/universities/${university.id}/edit">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/universities/new">Add University</a>
	</div>
</body>
</html>