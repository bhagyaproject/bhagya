<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Document</title>
</head>
<body>

	<form action="upload" method="post" enctype="multipart/form-data">

		<pre>
Id:<input type="text" name="fileId" />
Doc:<input type="file" name="fileob">
<input type="submit" value="upload">
</pre>
	</form>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Link</th>
		</tr>

		<c:forEach items="${list}" var="ob">
			<tr>
				<td>${ob[0]}</td>
				<td>${ob[1]}</td>
				<td><a href="download?fid=${ob[0]}">Download</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>