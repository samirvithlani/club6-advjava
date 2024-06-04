<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set value="768.970" var="amount">
</c:set>

<fmt:parseNumber var="j" type="number" integerOnly="true" value="${amount }">
</fmt:parseNumber>
${j }


<c:set var="amount1" value="9850.12115">
</c:set>
<br>
<%-- <fmt:formatNumber value="${amount1 }" type="currency">
</fmt:formatNumber> --%>
<br>
<%-- <fmt:formatNumber value="${amount1 }" groupingUsed="true">
</fmt:formatNumber> --%>
<br>
<%-- <fmt:formatNumber value="${amount1 }" maxIntegerDigits="3" maxFractionDigits="2">
</fmt:formatNumber> --%>

<%-- <fmt:formatNumber value="${amount1 }" type="percent">
</fmt:formatNumber> --%>
<%-- <fmt:formatNumber value="${amount1 }" type="number" pattern=".###$">
</fmt:formatNumber> --%>

<c:set var="date" value="<%=new java.util.Date() %>">

</c:set>
${date }
<br>
<fmt:formatDate value="${date }" type="time"/>
<br>
<fmt:formatDate value="${date }" type="date"/>
<br>
<fmt:formatDate value="${date }" type="both"/>
<br>
<br>
<fmt:formatDate value="${date }" type="both" dateStyle="medium"/>
<br>
<fmt:formatDate value="${date }" type="both" dateStyle="short"/>
<br>
<fmt:formatDate value="${date }" type="both" dateStyle="long"/>


</body>

</html>