<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value=" amit thakkar  "></c:set>
<c:if test="${fn:containsIgnoreCase(name,'Thakkar') }">
	<h1>True</h1>
</c:if>
<c:if test="${fn:endsWith(name,'r') }">
	yes ends with r
</c:if>

<h4>
index of = ${fn:indexOf(name,' ') }
</h4>
<h4>
length = ${fn:length(name) }
</h4>

<c:set var="name1" value="${fn:trim(name) }">

</c:set>
<h2>${name }</h2>
<h4>after trim name1 =  ${fn:length(name1) }</h4>

<p>${fn:toUpperCase(name1)}</p>

<c:set var="sent" value="hi this is royal technosoft"></c:set>

<c:set var="sent1" value="${fn:split(sent,' ') }">
</c:set>

<p>${sent1}</p>
<c:forEach var="i" items="${sent1 }">
<br>
	${i }
</c:forEach>


</body>
</html>