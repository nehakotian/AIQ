<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#A8DDE8">
<jsp:include page="banner.jsp"/>
<div class="container">
<h1>Register</h1><hr>
<form action="user.quiz">
<table align="center">
<tr>
<td>
	<tr>
	<td>
	<label>Email ID :</label> </td>
	<td><input  type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required><br>
	</td>
	</tr>
	<tr>
	<td>
	<label>Password:</label></td>
	<td> <input type="password" name="password" required><br>
	</td>
	</tr>
	<tr>
	<td>
	<label>Favorite super hero:</label></td>
	<td> <input type="text" name="answer" required><br>
	</td>
	</tr>
	<tr>
	<td colspan="2" align="center">
	<input type="submit" class="btn btn-success" value="Register">
	</td>
	</tr>
	</table>
</form>
<%@ include file="footer.html" %>
</div>
</body>
</html>