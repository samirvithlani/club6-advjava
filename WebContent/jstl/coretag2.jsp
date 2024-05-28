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
<c:out value="${name }"></c:out>
<c:forEach var="u" items="${users }">
<c:out value="${u }"></c:out>
</c:forEach>

<c:forEach var="p" items="${products }">
	<p><c:out value="${p.pName }"></c:out></p>
	<p><c:out value="${p.pPrice }"></c:out></p>
</c:forEach>
</body>
</html>