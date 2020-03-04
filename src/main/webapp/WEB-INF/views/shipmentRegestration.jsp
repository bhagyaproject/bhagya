<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<body>
	<meta charset="ISO-8859-1">
	<title>Welcome to Shipment type Register Page</title>
	<form action="save" method="post">
		<pre>
shipment Mode:<br>
<select name="shipMode">
<option>-----Select-----</option>
<option>Air</option>
<option>Track</option>
<option>Ship</option>
<option>Train</option>
</select>
Shipment Code:<br> 
<input type="text" name="shipCode" /> 

Enable shiment: <br>
<select name="enbship">
<option>-----Select-----</option>
<option>Yes</option>
<option>No</option>
</select>

Shipment Grade: <br>
<input type="radio" name="shipGrade" value="A" />A
<input type="radio" name="shipGrade" value="B" />B
<input type="radio" name="shipGrade" value="C" />C

Description: <br>
<textarea name="shipDesc"></textarea>

<br>
<input type="submit" value="CREATE SHIPMENT" />


</pre>

	</form>
	${message}


</body>
</head>
</html>