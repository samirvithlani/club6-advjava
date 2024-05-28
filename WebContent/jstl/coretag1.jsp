<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="age" value="19"></c:set>
	<h1>
		Age =
		<c:out value="${age }"></c:out>
	</h1>
	<c:if test="${age>=18 }">
		<h3>user is valid... </h3>
	</c:if>
	
	<c:choose>
		<c:when test="${age>=25 }">
			user is valid...with 25
		</c:when>
		<c:when test="${age>=18 }">
			user is valid with 18...
		</c:when>
		<c:otherwise>
			user is not valid...
		</c:otherwise>
	</c:choose>
	
	<c:forEach var="i" begin="1" end="10">
		*<c:out value="${i }"></c:out>
	</c:forEach>

</body>
</html>