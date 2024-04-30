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
		String isAdded = (String) request.getAttribute("isAdded");
	out.print(isAdded);
	    if(isAdded!=null){
	%>
	<script type="text/javascript">
		alert(<%=isAdded%>)
	</script>
	<%} %>
	<form action="AddStudentController">

		<div>
			<label>NAME</label> <input type="text" name="txtStudentName"
				placeholder="Enter Name">
		</div>
		<div>
			<label>Email</label> <input type="text" name="txtStudentEmail"
				placeholder="Enter Email">
		</div>
		<div>
			<label>Password</label> <input type="password"
				name="pwdStudentPassword" placeholder="Enter Password">
		</div>
		<div>
			<label>Age</label> <input type="text" name="txtStudentAge"
				placeholder="Enter Age">
		</div>
		<div>
			<label>Marks</label> <input type="text" name="txtStudentMarks"
				placeholder="Enter Marks">
		</div>
		<div>
			<input type="submit" value="ADD STUDENT">
		</div>

	</form>
</body>
</html>