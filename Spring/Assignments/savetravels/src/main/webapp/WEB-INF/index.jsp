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
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	
</head>
<body>
	<h1>Save Travels</h1>
	<div class="tableChart">
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="expense" items="${expenses}">
					<tr>
						<td valign="middle"><a href="/expenses/${expense.id}"><c:out value="${expense.name}"/></a></td>
						<td valign="middle"><c:out value="${expense.vendor}"/></td>
						<td valign="middle"><c:out value="$ ${expense.amount}"/></td>
						<td>
							<div class="actions">
								<a href="/expenses/${expense.id}/edit">edit</a>
								<form action="/expenses/${expense.id}/delete" method="post">
									<input type="hidden" name="_method" value="delete">
									<input type="submit" id="deletebtn" class="btn btn-danger" value="Delete"/>
								</form>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<h2>Add an expense:</h2>
	<div class="formbox">
		<form:form action="/expenses" method="post" modelAttribute="expense">
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
