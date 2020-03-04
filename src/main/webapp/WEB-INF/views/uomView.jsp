<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h3>WELCOME TO SHIPMENT TYPE VIEW PAGE</h3>
	<table border="1">
		<tr>
			<td>ID</td>
			<th>${ob.uomId}</th>
		<tr>
		<tr>
			<td>Type</td>
			<th>${ob.uomType}</th>
		</tr>
		<tr>
			<td>Model</td>
			<th>${ob.uomModel}</th>
		</tr>
		<tr>
			<td>Note</td>
			<th>${ob.desc}</th>
		</tr>

		<%-- <tr>
			<td><a href="view?sid=${ob.shipId }">View</a></td>
		</tr> --%>
	</table>
</body>
</html>