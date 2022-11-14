<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Omikuji</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1>Send an Omikuji!</h1>
	<div class="formbox">
		<form action="/process" method="post">
			<div>
				<label>Pick any number from 5 to 25</label>
			</div>
			<input type="number" name="number">
			<div>
				<label>Enter the name of any city.</label>
			</div>
			<input type="text" name="city">
			<div>
				<label>Enter the name of any real person.</label>
			</div>
			<input type="text" name="person">
			<div>
				<label>Enter professional endeavor or hobby.</label>
			</div>
			<input type="text" name="hobby">
			<div>
				<label>Enter any type of living thing.</label>
			</div>
			<input type="text" name="thing">
			<div>
				<label>Say something nice to someone.</label>
			</div>
			<textarea name="nice" rows="10" cols="30"></textarea>
			<div>
				<label>Send and show a friend</label>
			</div>
			<div class="send">
				<input type="submit" value="Send">
			</div>
		</form>
	</div>
</body>
</html>