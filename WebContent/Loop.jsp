<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
	for(int i=1;i<=10;i++){ %>
		
				<br>
		<font size =<%=i %>><%=i %></font>
		
	<%} %> --%>


<%
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5 - i; j++) {
            out.print("&nbsp;&nbsp;"); // Adjust spaces to form a pyramid
        }
        for (int k = 1; k <= (2 * i - 1); k++) {
            out.print("<span style='color:red'>*</span>");
        }
        out.print("<br>");
    }
%>

<%

	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){%>
				<span style ='color:red'>*</span>
		<%} %>
		<br>
	<%}  %>
	




</body>
</html>