<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
</head>
<body>
	<a href="/books">All Books</a>
	<h1><c:out value="${book.title}"/></h1>
	<h3>Description: <c:out value="${book.description}"/></h3>
	<h3>Language: <c:out value="${book.language}"/></h3>
	<h3>Number of Pages: <c:out value="${book.numberOfPages}"/></h3>
	<a href="/books/${book.id}/edit">Edit</a>
	<form action="/books/${book.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="Delete"/>
	</form>
</body>
</html>