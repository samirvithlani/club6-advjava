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
	<%
		StudentBean studentBean = (StudentBean) request.getAttribute("student");
	%>
	<form action="UpdateStudentController" method="POST">
		<input name ="id" type="hidden" value = "<%=studentBean.getsId()%>">
		<div>
			<label>NAME</label> <input type="text" name="txtStudentName"
				placeholder="Enter Name" value="<%=studentBean.getsName()%>">
		</div>
		<div>
			<label>Email</label> <input type="text" name="txtStudentEmail"
				placeholder="Enter Email" value="<%=studentBean.getsEmail()%>">
		</div>
		<div>
			<label>Password</label> <input type="password"
				name="pwdStudentPassword" placeholder="Enter Password"
				value="<%=studentBean.getsPassword()%>">
		</div>
		<div>
			<label>Age</label> <input type="text" name="txtStudentAge"
				placeholder="Enter Age" value="<%=studentBean.getsAge()%>">
		</div>
		<div>
			<label>Marks</label> <input type="text" name="txtStudentMarks"
				placeholder="Enter Marks" value="<%=studentBean.getsMarks()%>">
		</div>
		<div>
			<input type="submit" value="Update STUDENT">
		</div>

	</form>
</body>
</html>