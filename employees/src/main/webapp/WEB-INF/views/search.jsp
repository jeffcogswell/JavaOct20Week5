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

	<h1>Search Results</h1>
	
	<a href="/">Home</a><br />
	
	<c:forEach var="emp" items="${ results }">
		<a href="/employee/${ emp.getId() }">${ emp.getFirstName() } ${ emp.getLastName() }</a><br />
	</c:forEach>
	
</body>
</html>











