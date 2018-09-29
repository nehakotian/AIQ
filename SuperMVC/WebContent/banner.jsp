<%@page import="lti.quiz.entity.User"%>
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
<body style="background-color:#A8DDE8">
<h1>SuperQuiz.com >> Invoke your inner hero.</h1>

<% User user= (User) session.getAttribute("USER");
	if(user!=null) { %>
	<div>Welcome <%= user.getEmail() %> | <a href="logout.quiz?logout=yes">Logout</a></div>
<% } else {  %>
<div>Welcome Guest</div>
<% } %>
</body>
</html>