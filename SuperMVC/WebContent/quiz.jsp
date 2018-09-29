<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="lti.quiz.entity.Answer"%>
<%@page import="lti.quiz.entity.Quiz"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body style="background-color: #A8DDE8">
	<jsp:include page="banner.jsp" />
	<div class="container">
		<h3 class="alert alert-info" style="text-align: center">Take this quiz!!!</h3>
		
		<form action="quiz.quiz?choice" method="get">
		<h4>${Question.question}</h4>
		
		<c:forEach items = "${Question.options}" var = "option">
			<input type="radio" name="choice" value="${option.score}">${option.option} <br>
		</c:forEach>
		<input type="submit" value="Submit Answer" class="btn btn-info">
</form>
<br>
		<%@ include file="footer.html" %>
	</div>
</body>
</html>