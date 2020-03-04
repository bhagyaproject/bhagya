<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

	<form:form action="update" method="post" modelAttribute="uom"
		style="width: 400px;">
		<fieldset>
			<legend>Uom</legend>
			<!-- <pre> -->
			Uom Id :
			<form:input path="uomId" readonly="true" />
			
			<br> Uom Type :
			<form:select path="uomType">
				<form:option value="">--select--</form:option>
				<form:option value="Packing">Packing</form:option>
				<form:option value="NoPacking">No Packing</form:option>
				<form:option value="Na">-NA-</form:option>
			</form:select>


			<br> <br> Uom Model :
			<form:input path="uomModel" />

			<br> <br> Uom Description :
			<form:textarea path="desc" />


			<br> <br> <input type="submit" value="UPDATE" />
			<!-- </pre> -->
		</fieldset>
	</form:form>
	${message}
</body>
</html>