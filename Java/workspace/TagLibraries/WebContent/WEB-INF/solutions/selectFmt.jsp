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
		<%--
		<c:choose>
		<c:when test="${stock.price > 75 }"><strong></c:when>
		<c:when test="${stock.price < 35 }"><em></c:when>		
		</c:choose>
		${stock.name}
		<ul>
		<li>${stock.symbol }</li>
		<li><fmt:formatNumber type="currency" value="${stock.price }"/></li>
		</ul>
		<c:choose>
		<c:when test="${stock.price > 75 }"></strong></c:when>
		<c:when test="${stock.price < 35 }"></em></c:when>		
		</c:choose>
		--%>
		<c:if test="${stock.price > 75}"><strong></c:if>
		<c:if test="${stock.price < 35}"><em></c:if>
		${stock.name}
		<ul>
		<li>${stock.symbol }</li>
		<li><fmt:formatNumber type="currency" value="${stock.price }"/></li>
		</ul>
		<c:if test="${stock.price > 75}"></strong></c:if>
		<c:if test="${stock.price < 35}"></em></c:if>
		
		<p>
			<a href="index.html" class="btn btn-secondary" role="button">Back to Home</a>
		</p>

	</div>
</body>
</html>