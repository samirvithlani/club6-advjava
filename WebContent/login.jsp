<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginController" method="POST">
		<div>
			<label>EMAIL</label> <input type="text" name="email">
		</div>
		<div>
			<label>PASSWORD</label> <input type="text" name="password">
		</div>
		<div>
			<input type="submit" value="login">
		</div>

	</form>

</body>
</html>