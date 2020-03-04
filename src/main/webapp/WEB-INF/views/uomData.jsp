<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to UOM Data Page</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="2">
				<tr>
					<th>Id</th>
					<th>Type</th>
					<th>Model</th>
					<th>Note</th>
					<th colspan="3">Opretions</th>
				</tr>
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.uomId}</td>
						<td>${ob.uomType}</td>
						<td>${ob.uomModel }</td>
						<td>${ob.desc }</td>

						<td><a href="delete?uomid=${ob.uomId }">Delete</a></td>
						<td><a href="view?uomid=${ob.uomId }">View</a></td>
						<td><a href="edit?uomid=${ob.uomId}">Edit</a></td>
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