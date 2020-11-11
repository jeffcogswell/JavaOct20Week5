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

	<a href="/">Home</a><br />

	<h1>All Employees</h1>
	
	<c:forEach var="emp" items="${ emps }">
	
		<a href="/employee/${ emp.value.getId() }">${ emp.value.getFirstName() } ${ emp.value.getLastName() }</a>
		<br />
	
	</c:forEach>
	
</body>
</html>









