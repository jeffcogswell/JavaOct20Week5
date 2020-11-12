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
	<h1>Thank you for your pizza order</h1>

	<h2>Meat Toppings</h2>	
	<c:forEach var="meatitem" items="${ meattoppings }">
		${ meatitem }<br />
	</c:forEach>
	
	<h2>Veggie Toppings</h2>
	<c:forEach var="veggieitem" items="${ veggietoppings }">
		${ veggieitem }<br />
	</c:forEach>
	
</body>
</html>