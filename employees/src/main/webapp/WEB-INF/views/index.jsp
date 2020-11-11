<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</body>
</html>