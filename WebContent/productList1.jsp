<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String isDeleted = (String) request.getAttribute("isDeleted");
	if (isDeleted != null) { %>
			<script type="text/javascript">
				alert("record is deleted...");
			</script>
	<%} %>
	
	<%
		List<ProductBean> products = (List<ProductBean>) request.getAttribute("products"); //3
	if (products != null) {
	%>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>PID</th>
				<th>NAME</th>
				<th>PRICE</th>
				<th>QTY</th>
				<th>ACTION</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < products.size(); i++) {
				ProductBean productBean = products.get(i);//0th index //1st //2.....
			%>
			<tr>
				<td><%=productBean.getpId()%></td>
				<td><%=productBean.getpName()%></td>
				<td><%=productBean.getpPrice()%></td>
				<td><%=productBean.getpQty()%></td>
				<td><a
					href="DeleteProductController?id=<%=productBean.getpId()%>"
					class="btn btn-danger">DELETE</a></td>
			</tr>


			<%
				}
			%>
		</tbody>

	</table>
	<%
		} else {
	%>
	<h1>NO PRODUCT FOUND...</h1>
	<%
		}
	%>
</body>
</html>