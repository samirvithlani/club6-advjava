<%@page import="com.util.CourseUtil"%>
<%@page import="com.bean.CourseBean"%>
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
	List<CourseBean> courses = CourseUtil.getAllCourse();
%>
	<%
		String isAdded = (String) request.getAttribute("isAdded");
	out.print(isAdded);
	if (isAdded != null) {
	%>
	<script type="text/javascript">
		alert(
	<%=isAdded%>
		)
	</script>
	<%
		}
	%>
	<form action="AddStudentController">
		<div>
			<label>COURSE</label>
			<select name="cid">
			<option>SELECT COURSE</option>
				<%
				for(int i=0;i<courses.size();i++){
					CourseBean courseBean = courses.get(i);
				%>
					<option value="<%=courseBean.getcId()%>"><%=courseBean.getcId() %> <%=courseBean.getcName() %></option>
				<%} %>
			</select>
		</div>
		<div>
			<label>NAME</label> <input type="text" name="txtStudentName"
				placeholder="Enter Name">
			<%
				String sNameError = (String) request.getAttribute("sNameError");
			if (sNameError != null) {
				out.print(sNameError);
			}
			%>
		</div>
		<div>
			<label>Email</label> <input type="text" name="txtStudentEmail"
				placeholder="Enter Email">
			<%
				String emailError = (String) request.getAttribute("sEmailError");
			out.print(emailError);
			%>
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