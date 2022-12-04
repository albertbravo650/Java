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
		<h1><c:out value="${dojo.name} "></c:out>Location Ninjas</h1>
		<a href="/dojos/new">Back to Dojos</a>
	</div>
	<div class="tableChart">
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ninja" items="${dojo.ninjas}">
					<tr>
						<td valign="middle"><c:out value="${ninja.firstName}"/></td>
						<td valign="middle"><c:out value="${ninja.lastName}"/></td>
						<td valign="middle"><c:out value="${ninja.age}"/></td>
						<td>
							<div class="actions">
								<form action="/ninjas/${ninja.id}/delete" method="post">
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
</body>
</html>