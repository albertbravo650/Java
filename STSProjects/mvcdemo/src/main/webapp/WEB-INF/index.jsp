<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
</head>
<body>
	<a href="/books/new">Add Book</a>
	<h1>All Books</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Language</th>
				<th>Number of Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td><c:out value="${book.id}"/></td>
					<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
					<td><c:out value="${book.language}"/></td>
					<td><c:out value="${book.numberOfPages}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>