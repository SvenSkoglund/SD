<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Stock</title>
</head>
<body>
	<div class="container">

		<c:if test="${not empty stock}">
			<strong>${stock.price}</strong>
				
		${stock.name}
		<ul>
				<li>${stock.symbol }</li>
				<li><c:if test="${stock.price > 75}">
						<strong><fmt:formatNumber type="currency" value="${stock.price}"/></strong>
					</c:if> <c:if test="${stock.price < 35}">
						<em><fmt:formatNumber type="currency" value="${stock.price}"/></em>
					</c:if></li>
			</ul>
		</c:if>
		<c:if test="${	empty stock}">
			<strong>Stock not found <br></strong>
		</c:if>
		
		<a href="index.html" class="btn btn-secondary" role="button">Back
			to Home</a>
		</p>

	</div>
</body>
</html>