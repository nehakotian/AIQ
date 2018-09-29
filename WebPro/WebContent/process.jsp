<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errpage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<body>
<jsp:useBean id="item" class="lti.bean.ProductBean" scope="request"/>

<jsp:setProperty property="*" name="item"/>
<!-- If all the property names are same we need not write below three lines -->

<sql:update dataSource="jdbc/myoracle">
insert into products values (${item.code},'${item.name}',${item.price})
</sql:update>

<%-- <jsp:setProperty property="code" name="item"/>
<jsp:setProperty property="name" name="item"/>
<jsp:setProperty property="price" name="item" param="price"/> --%>

<% response.sendRedirect("output.jsp"); %>

<!-- for redirect scope is "session"  and for request scope is "request" -->
<%-- <jsp:forward page="output.jsp"/>  --%>
</body>
</html>