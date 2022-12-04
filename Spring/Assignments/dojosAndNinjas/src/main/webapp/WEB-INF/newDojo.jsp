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
		<h1>New Dojo</h1>
	</div>
	<div>
		<form:form action="/dojos/create" method="post" modelAttribute="dojo">
			<div class="formrow">
				<form:label path="name">Name: </form:label>
				<form:errors path="name"/>
				<form:input class="forminput" path="name"/>
			</div>
			<div class="submitbutton">
				<input type="submit" class="btn btn-primary" value="Create">
			</div>
		</form:form>
	</div>
	<a href="/ninjas/new">Add Ninja</a>
	<div class="tableChart">
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Name</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dojo" items="${dojos}">
					<tr>
						<td valign="middle"><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
						<td>
							<div class="actions">
								<form action="/dojos/${dojo.id}/delete" method="post">
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