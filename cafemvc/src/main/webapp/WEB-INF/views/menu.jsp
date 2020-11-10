<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Menu</h1>
	
	Please enter the items to order:<br />
	
	<form method="post" action="/order">
	
		Name: <input type="text" name="name" /><br />
		
		Size: <select name="size">
			<option>Grande</option>
			<option>Venti</option>
		</select><br />
		
		Espresso Upgrade: <input type="checkbox" name="upgrade" id="upgrade" /><br />
		
		<input type="submit" />
		
	</form>
	
</body>
</html>