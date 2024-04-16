<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<div>
	<form action="AddProductController">

		<div class="form-group">
			<label for="exampleInputEmail1">Product Name</label> <input
				name="pname" type="text" class="form-control"
				placeholder="Enter name">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Product Qty</label> <input
				name="pqty" type="text" class="form-control" placeholder="Enter qty">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Product Price</label> <input
				name="pprice" type="text" class="form-control"
				placeholder="Enter price">
		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Product Discount</label> <input
				name="pdisc" type="text" class="form-control"
				placeholder="Enter discount">
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</div>

</body>
</html>