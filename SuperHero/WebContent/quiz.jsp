<%@page import="lti.quiz.bean.OptionBean"%>
<%@page import="lti.quiz.bean.QuizBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #A8DDE8">
	<jsp:include page="banner.jsp" />
	<div class="container">
		<h3 class="alert alert-info" style="text-align: center">Take this quiz!!!</h3>
		<% QuizBean quiz = (QuizBean) request.getAttribute("Question"); %>
		<form action="quiz.quiz">
		<h4><%= quiz.getQuestion() %></h4>
		<%
			for (OptionBean option : quiz.getOptions()) { %>
		<input type="radio" name="choice" value="<%= option.getScore() %>"><%=option.getOption() %><br>
		<% } %>
		<input type="submit" value="Submit Answer" class="btn btn-info">
</form>
<br>
		<%@ include file="footer.html" %>
	</div>
</body>
</html>