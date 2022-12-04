<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojos and Ninjas</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/edit.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="header">
		<h1>New Ninja</h1>
		<a href="/dojos/new">Back to Dojos</a>
	</div>
	<div>
		<form:form action="/ninjas/create" method="post" modelAttribute="ninja">
			<div class="formrow">
				<form:label path="dojo">Dojo: </form:label>
				<form:errors path="dojo"/>
				<form:select class="forminput" path="dojo">
					<c:forEach var="dojo" items="${dojos}">
						<option value="${dojo.id}">${dojo.name}</option>
					</c:forEach>
				</form:select>
			</div>
			<div class="formrow">
				<form:label path="firstName">First Name: </form:label>
				<form:errors path="firstName"/>
				<form:input class="forminput" path="firstName"/>
			</div>
			<div class="formrow">
				<form:label path="lastName">Last Name: </form:label>
				<form:errors path="lastName"/>
				<form:input class="forminput" path="lastName"/>
			</div>
			<div class="formrow">
				<form:label path="age">Age: </form:label>
				<form:errors path="age"/>
				<form:input type="number" class="forminput" path="age"/>
			</div>
			<div class="submitbutton">
				<input type="submit" class="btn btn-primary" value="Create">
			</div>
		</form:form>
	</div>
</body>
</html>