<%@page import="com.bean.StudentBean"%>
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
	String deleted = (String)request.getAttribute("deleted");
	if(deleted!=null){
		
		out.print(deleted);
	}

%>

	<%
		List<StudentBean> students = (List<StudentBean>) request.getAttribute("students");
	%>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>AGE</th>
				<th>PASSWORD</th>
				<th>MARKS</th>
				<th>Courcename</th>
				<th>ACTION</th>
				
			</tr>

		</thead>
		<tbody>
			<%
				for (int i = 0; i < students.size(); i++) {
				StudentBean studentBean = students.get(i);
			%>

			<tr>
				<td><%=studentBean.getsId()%></td>
				<td><%=studentBean.getsName()%></td>
				<td><%=studentBean.getsEmail()%></td>
				<td><%=studentBean.getsAge()%></td>
				<td><%=studentBean.getsPassword()%></td>
				<td><%=studentBean.getsMarks()%></td>
				<td><%=studentBean.getcName()%></td>
				<td><a
					href="DeleteStudentController?id=<%=studentBean.getsId() %>">DELETE</a>
					<a href = "DetailStudentController?id=<%=studentBean.getsId() %>">DETAIL</a>
					<a href = "EditStudentController?id=<%=studentBean.getsId() %>">UPDATE</a>
				</td>

			</tr>

			<%
				}
			%>
		</tbody>
	</table>


</body>
</html>