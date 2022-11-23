<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Save Travels</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/show.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="header">
		<h1>Expense Details</h1>
		<a href="/expenses">Go Back</a>
	</div>
	<h3>Expense Name: <c:out value="${expense.name}"/></h3>
	<h3>Expense Description: <c:out value="${expense.description}"/></h3>
	<h3>Vendor: <c:out value="${expense.vendor}"/></h3>
	<h3>Amount Spent: <c:out value="${expense.amount}"/></h3>
</body>
</html>
