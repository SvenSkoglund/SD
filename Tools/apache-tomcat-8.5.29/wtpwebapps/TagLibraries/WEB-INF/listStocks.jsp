<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Stock List</title>
</head>
<body>
	<div class="container">
		<%-- Iterate through the Stocks and print all data in a table row. --%>
		<table>
			<c:forEach var="s" items="${allStocks}">
				<tr>
					<td><c:out value="${s.name}" /></td>
					<td><c:out value="${s.symbol}" /></td>
					<td><c:out value="${s.price}" />/></td>
				</tr>
			</c:forEach>

		</table>
		
		<p>
			<a href="index.html" class="btn btn-secondary" role="button">Back
				to Home</a>
		</p>
	</div>
</body>
</html>