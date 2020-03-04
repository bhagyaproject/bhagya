<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UOM Module</title>
</head>
<body>

	<form action="save" method="post">
		<pre>
UOM Type:<br>
<select name="uomType">
<option>-----Select-----</option>
<option>Packing</option>
<option>No Packing</option>
<option>-NA-</option>
</select>
<br>

UOM Model:<br> 
<input type="text" name="uomModel" /> 
<br>

Description:
<textarea name="desc"></textarea>
<br>
<input type="submit" value="CREATE SHIPMENT" />
</pre>
	</form>
</body>
</html>