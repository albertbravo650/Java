<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
	<meta charset="ISO-8859-1">
	<title>RelationshipsDemo</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>New License Form</h1>
	<div>
		<form:form action="/license/create" method="post" modelAttribute="person">
			<!--- inside the form:form --->
		    <!--- Drop down select menu --->
		    <form:select path="person">
		        <c:forEach var="onePerson" items="${persons}">
		            <!--- Each option VALUE is the id of the person --->
		            <form:option value="${onePerson.id}" path="person">
		            <!--- This is what shows to the user as the option --->
		                <c:out value="${onePerson.firstName}"/>
		                <c:out value="${onePerson.lastName}"/>
		            </form:option>
		        </c:forEach>
		    </form:select>
			<input type="submit" value="Submit">
		</form:form>
	</div>
</body>
</html>