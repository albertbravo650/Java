<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>DEMO</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<h1>Hello World</h1>
	
	<% for(int i = 0; i < 5; i++) {%>
		<h1><%= i %></h1>
	<% } %>
	
	<h3>The date is: <%= new Date() %></h3>
	
	<h1>Fruit of the Day:</h1>
	<h2><c:out value="${fruit}"/></h2>
	
</body>
</html>