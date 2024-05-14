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

${name }

<%-- <% StudentBean studentBean = (StudentBean)request.getAttribute("student"); %>
<%=studentBean.getsName() %> --%>

${student.sName }
</body>
</html>