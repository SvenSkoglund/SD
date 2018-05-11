<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Presidents</title>
</head>
<body>
	Display a president's data.
	<table>
		<tr>
		<strong>
			<td>First Name</td>
			<td>Middle Name</td>
			<td>Last Name</td>
			<td>Elections Won</td>
			<td>Why Left Office</td>
			<td>Party</td>
		</strong>

		</tr>
		<tr>
			<td>${president.firstName}</td>
			<td>${president.middleName}</td>
			<td>${president.lastName}</td>
			<td>${president.electionsWon}</td>
			<td>${president.whyLeftOffice}</td>
			<td>${president.party}</td>

		</tr>
	</table>
	<p>(Don't forget to add the taglib.)</p>
</body>
</html>