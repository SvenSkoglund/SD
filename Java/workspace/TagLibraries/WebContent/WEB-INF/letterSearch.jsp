<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Stock List</title>
</head>
<body>
	<div class="container">
		<h1>You searched for ${search}</h1>
		<table>
			<c:forEach var="s" items="${letterSearch}">
				<tr>
					<td>${s.name}</td>
					<td>${s.symbol}</td>
					<td><fmt:formatNumber type="currency" value="${s.price}"/>
					</td>
				</tr>
			</c:forEach>
		</table>
		<c:if test="${empty letterSearch}">
			<h2>No results found!</h2>
		</c:if>
		<p>
			<a href="index.html" class="btn btn-secondary" role="button">Back
				to Home</a>
		</p>
	</div>
</body>
</html>