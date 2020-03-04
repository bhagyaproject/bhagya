<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Page</title>
</head>
<body>
	<h3>WELCOME TO SHIPMENT TYPE VIEW PAGE</h3>
	<table border="1">
		<tr>
			<td>ID</td>
			<th>${ob.shipId}</th>
		<tr>
		<tr>
			<td>MODE</td>
			<th>${ob.shipMode}</th>
		</tr>
		<tr>
			<td>CODE</td>
			<th>${ob.shipCode}</th>
		</tr>
		<tr>
			<td>ENABLE</td>
			<th>${ob.enbShip}</th>
		</tr>
		<tr>
			<td>GRADE</td>
			<th>${ob.shipGrade}</th>
		</tr>
		<tr>
			<td>NOTE</td>
			<th>${ob.shipDesc}</th>
		</tr>
		<%-- <tr>
			<td><a href="view?sid=${ob.shipId }">View</a></td>
		</tr> --%>
	</table>
</body>
</html>