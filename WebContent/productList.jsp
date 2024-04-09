<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String pName = (String)request.getAttribute("pname");

%>
<%=pName %>

<%
int pprice = (Integer)request.getAttribute("pprice");
out.print(pprice);
%>

<%List users = (List)request.getAttribute("users"); %>
<%
	for(int i=0;i<users.size();i++){
		
		out.print(users.get(i));
	}
%>

</body>
</html>