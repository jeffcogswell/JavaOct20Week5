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
	<h1>C:If Test</h1>
	
	<c:if test="${ upgrade == true }">
		You did an upgrade!<br />
	</c:if>
	
	<c:if test="${ option1 }">
		Thank you for adding option1<br />
	</c:if>
	<c:if test="${ !option1 }">
		You chose to not upgrade
	</c:if>
	
</body>
</html>





