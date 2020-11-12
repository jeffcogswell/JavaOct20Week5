<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/posttoppings">

		<h2>Meat Toppings</h2>	
		<input type="checkbox" name="meattoppings" value="pepperoni" /> Pepperoni<br />
		<input type="checkbox" name="meattoppings" value="sausage" /> Sausage<br />
		<input type="checkbox" name="meattoppings" value="chicken" /> Chicken<br />
		
		<h2>Veggie Toppings</h2>
		<input type="checkbox" name="veggietoppings" value="mushroom" /> Mushroom<br />
		<input type="checkbox" name="veggietoppings" value="onion" /> Onion<br />
		<input type="checkbox" name="veggietoppings" value="greenpeppers" /> Green Peppers<br />
		
		<input type="submit" />
	
	</form>
</body>
</html>