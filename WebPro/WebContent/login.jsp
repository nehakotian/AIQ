<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>Login Screen</h1><hr>
<% if(request.getParameter("invalid") != null) { %>
<div class="alert-danger">Invalid User ID/Password</div>
<% } %>
<form action="login.do">
	User ID : <input name="userid"><br>
	Password: <input type="password" name="password"><br>
	<input type="submit" value="Login">
	</form>
	</div>
</body>
</html>