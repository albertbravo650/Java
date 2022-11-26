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
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Edit a University</h1>
<a href="/universities" class="btn btn-primary">All Universities</a>
	<form:form action="/universities/new" method="post" modelAttribute="newUniversity">
		<input type="hidden" name="_method" value="put"/>
		<form:errors></form:errors>
		<p>
			<form:label path="city">City:</form:label>
			<form:errors path="city"/>
			<form:input path="city"/>
		</p>
		<p>
			<form:label path="name">Name:</form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="enrollment">Enrollment:</form:label>
			<form:errors path="enrollment"/>
			<form:input path="enrollment" type="number" min="1" max="999999999" step="1"/>
		</p>
		<p>
			<form:label path="isOnline">Online?:</form:label>
			<form:errors path="isOnline"/>
			<form:radiobutton path="isOnline" value="1"/>Yes
			<form:radiobutton path="isOnline" value="0"/>No
		</p>
		<p>
			<form:label path="isInPerson">In Person?:</form:label>
			<form:errors path="isInPerson"/>
			<form:radiobutton path="isInPerson" value="1"/>Yes
			<form:radiobutton path="isInPerson" value="0"/>No
		</p>
		<p>
			<form:label path="yearFounded">Year founded:</form:label>
			<form:errors path="yearFounded"/>
			<form:input path="yearFounded" type="number" min="1" max="999999999" step="1"/>
		</p>
		<input type="submit" value="Edit University">
	</form:form>
</body>
</html>