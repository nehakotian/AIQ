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
		<h1>Login Screen</h1>
		<hr>
		<% if(request.getParameter("invalid")!=null) {
			%>
		
		<div class="alert-danger">Invalid email id or password</div>
		<% } %>
		
		
		<form action="user.quiz">
			<table align="center">
				<tr>
					<td><lable>User ID :</lable></td>
					<td><input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required><br></td>
				</tr>
				<tr>
					<td><lable>Password:</lable></td>
					<td><input type="password" name="password" required> <br></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						class="btn btn-success" value="Login"><br></td>
				</tr>
				<tr>
					<td><a href="forget.jsp">Forgot password?</a><br> 
					<a href="register.jsp">Register</a></td>
				</tr>
			</table>
		</form>
		<%@ include file="footer.html" %>
	</div>
</body>
</html>