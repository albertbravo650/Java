<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>University App</title>
</head>
<body>
	<div>
		<a href="/universities">All Universities</a>
		<h1>About <c:out value="${thisUniversity.name}"/></h1>
		<p>City: <c:out value="${thisUniversity.city}"/></p>
		<p>Online?: <c:out value="${thisUniversity.isOnline}"/></p>
		<p>In Person?: <c:out value="${thisUniversity.isInPerson}"/></p>
		<p>Enrollment: <c:out value="${thisUniversity.enrollment}"/></p>
		<p>Year Founded: <c:out value="${thisUniversity.year}"/></p>
	</div>
</body>
</html>