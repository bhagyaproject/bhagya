<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shipment Edit Page</title>
</head>
<body>
	<h1>Shipment Type Edit page</h1>
	<br>
	<form:form action="update" method="post" modelAttribute="shipmentType"
		style="width: 400px;">
		<fieldset>
			<legend>Shipment Type</legend>
			<!-- <pre> -->
			Shipment Id :
			<form:input path="shipId" readonly="true" />
			<br> <br> Shipment Mode :
			<form:select path="shipMode">
				<form:option value="">--select--</form:option>
				<form:option value="Air">Air</form:option>
				<form:option value="Ship">Ship</form:option>
				<form:option value="Train">Train</form:option>
				<form:option value="Truck">Truck</form:option>
			</form:select>
			<br> <br> Shipment Code :
			<form:input path="shipCode" />
			<br> <br> Enable Shipment:
			<form:select path="enbShip">
				<form:option value="">--select--</form:option>
				<form:option value="YES">YES</form:option>
				<form:option value="NO">NO</form:option>
			</form:select>
			<br> <br> Shipment Grade :
			<form:radiobutton path="shipGrade" value="A" />
			A
			<form:radiobutton path="shipGrade" value="B" />
			B
			<form:radiobutton path="shipGrade" value="C" />
			C <br> <br> Shipment Description :
			<form:textarea path="shipDesc" />
			<br> <br> <input type="submit" value="UPDATE" />
			<!-- </pre> -->
		</fieldset>
	</form:form>
	<br> ${message}
</body>
</html>