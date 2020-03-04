<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Shipment Type Data Page</title>
</head>
<body>

	<c:choose>
		<c:when test="${!empty list }">
			<a href="pdf?id=${ob.shipId}">PDF Export</a>
			<a href="excel?id=${ob.shipId}">Excel Export</a>
			<table border="2">
				<tr>
					<!-- <th>Id</th> -->
					<th>Mode</th>
					<th>Code</th>
					<th>Enable</th>
					<th>Grade</th>
					<th>Note</th>
					<th colspan="3">Opretions</th>
				</tr>
				<c:forEach items="${list}" var="ob">
					<tr>
						<%-- <td>${ob.shipId}</td> --%>
						<td>${ob.shipMode}</td>
						<td>${ob.shipCode}</td>
						<td>${ob.enbShip}</td>
						<td>${ob.shipGrade}</td>
						<td>${ob.shipDesc}</td>

						<td><a href="delete?sid=${ob.shipId }">Delete</a></td>
						<td><a href="view?sid=${ob.shipId }">View</a></td>
						<td><a href="edit?sid=${ob.shipId}">EDIT</a></td>


					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h4>No Data Found</h4>
		</c:otherwise>
	</c:choose>
</body>
</html>