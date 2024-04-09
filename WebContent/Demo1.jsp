<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int age = 18;
   out.print(age);		
%>

<%! String name = "amit"; %>

<h1><%=name %></h1>

<%
	String name = "ajay";
%>
<h1><%out.print(name); %></h1>

</body>
</html>