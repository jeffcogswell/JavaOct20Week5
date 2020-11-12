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
	<h1>Welcome to the Employee Contact System</h1>
	
	<a href="/employee">All Employees</a><br />
	
	<h2>Search by last name</h2>
	<form method="get" action="/employee/search">
		First letters of last name: <input type="text" name="emp" /><br />
		<input type="submit" />
	</form>
	
	<br />
	
	<c:set var = "now" value = "<%= new java.util.Date()%>" />
	
    <p>Formatted Date (1): <fmt:formatDate type = "time" value = "${now}" /></p>
 
    <p>Formatted Date (2): <fmt:formatDate type = "date" value = "${now}" /></p>
    
    <p>Formatted Date (3): <fmt:formatDate type = "both" value = "${now}" /></p>
	
	<p>Formatted Date (7): <fmt:formatDate pattern = "yyyy-MM-dd hh:mm z" value = "${now}" /></p>
	
</body>
</html>









