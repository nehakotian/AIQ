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
<body style="background-color: #A8DDE8">
	<jsp:include page="banner.jsp" />
	<div class="container">
		<h1>Security question</h1>
		<hr>
		
		<div class="alert-info">${Info}</div>

		<form action="forget.quiz" method="post">
			<center>
				<label>Email:</label><input type="email" name="email"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required>
				<label>Favorite super hero: </label><input name="answer" required><br>
				<input type="submit" class="btn btn-success" value="Submit">
			</center>
		</form>
		<%@ include file="footer.html"%>
	</div>
</body>
</html>