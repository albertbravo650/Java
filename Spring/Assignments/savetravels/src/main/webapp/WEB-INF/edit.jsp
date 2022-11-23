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
	<link rel="stylesheet" href="/css/edit.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="header">
		<h1>Edit Expense</h1>
		<a href="/expenses">Go Back</a>
	</div>
	<div>
		<form:form action="/expenses/${expense.id}" method="post" modelAttribute="expense">
			<input type="hidden" name="_method" value="put"/>
			<div class="formrow">
				<form:label path="name">Expense Name: </form:label>
				<form:errors path="name"/>
				<form:input class="forminput" path="name"/>
			</div>
			<div class="formrow">
				<form:label path="vendor">Vendor: </form:label>
				<form:errors path="vendor"/>
				<form:input class="forminput" path="vendor"/>
			</div>
			<div class="formrow">
				<form:label path="amount">Amount: </form:label>
				<form:errors path="amount"/>
				<form:input class="forminput" type="number" step="0.01" path="amount"/>
			</div>
			<div class="formrow">
				<form:label path="description">Description: </form:label>
				<form:errors path="description"/>
				<form:textarea class="forminput" path="description"/>
			</div>
			<div class="submitbutton">
				<input type="submit" class="btn btn-primary" value="Submit">
			</div>
		</form:form>
	</div>
</body>
</html>