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
		int age = 18;
	if (age >= 18) {

		out.print("is valid...");
	} else {

		out.print("is not valid...");
	}
	%>
	
	<%
		int age1 =9;
		if(age1>=18){ %>
			<h1>IS VALID</h1>
		<%}else{ %>
			<h1>is not valid..</h1>
		<%} %>
		
		
	
	
	
</body>
</html>