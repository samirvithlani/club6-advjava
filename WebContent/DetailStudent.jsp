<%@page import="com.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% StudentBean studentBean = (StudentBean) request.getAttribute("student"); %>
<h1>NAME = <%=studentBean.getsName() %></h1>
</body>
</html>