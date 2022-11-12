<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Fruity Loops</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div class="container">
		<h1>Fruit Store</h1>
		<table class="table">
			<thead>
				<th>Name</th>
				<th>Price</th>
			</thead>
			<c:forEach var="oneItem" items="${fruitsFromController}">
				<tr>
					<td><c:out value="${oneItem.name}"></c:out></td>
					<td><c:out value="${oneItem.price}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>