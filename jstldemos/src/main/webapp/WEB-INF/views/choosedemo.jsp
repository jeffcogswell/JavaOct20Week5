<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Choose Demo</h1>
	
	<c:choose>
		<c:when test='${ size == "small" }'>
			Thank you for choosing a small pizza
		</c:when>
		<c:when test='${ size == "medium" }'>
			Our medium pizzas are awesome!
		</c:when>
		<c:when test='${ size == "large" }'>
			Large is the best!
		</c:when>
		<c:otherwise>
			We don't have pizzas of size ${ size }
		</c:otherwise>
	</c:choose>
	<h2>Thank you for your order!</h2>
	
</body>
</html>













