<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Stocks</title>
</head>
<body>
	<div class="container">
		Search string: <c:out value="${searchString }"/>
		<br >
		<c:if test="${empty stocks }">No stocks found</c:if>
		<c:if test="${not empty stocks }"> 
			<ul>
			<c:forEach var="item" items="${stocks}">
				<li>${item.symbol} ${item.name } <fmt:formatNumber type="currency" value="${item.price }"/></li>
			</c:forEach>
			</ul>
		</c:if>
		<p>
			<a href="indexSearch.html" class="btn btn-secondary" role="button">Back to Home</a>
		</p>

	</div>
</body>
</html>