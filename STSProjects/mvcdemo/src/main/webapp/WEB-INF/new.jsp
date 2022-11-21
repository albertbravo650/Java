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
	<h1>New Book Form</h1>
	<div>
		<form:form action="/books/create" method="post" modelAttribute="book">
			<div>
				<form:label path="title">Title: </form:label>
				<form:errors path="title"/>
				<form:input path="title"/>
			</div>
			<div>
				<form:label path="description">Description: </form:label>
				<form:errors path="description"/>
				<form:textarea path="description"/>
			</div>
			<div>
				<form:label path="language">Language: </form:label>
				<form:errors path="language"/>
				<form:input path="language"/>
			</div>
			<div>
				<form:label path="numberOfPages">Number of Pages: </form:label>
				<form:errors path="numberOfPages"/>
				<form:input type="number" path="numberOfPages"/>
			</div>
			<input type="submit" value="Submit">
		</form:form>
	</div>
</body>
</html>