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
	<h1>Order</h1>
	<h2>Hello, ${ name }</h2>
	You ordered: ${ size }<br />
	
	<c:if test="${ upgrade == true }">
		You upgraded with espresso shot<br />
	</c:if>
	<c:if test="${ upgrade != true }">
		You did not upgrade<br />
	</c:if>

	Your total: ${ price }
</body>
</html>