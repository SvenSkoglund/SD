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

	<h3>
		You searched for
		<c:out value="${searchString }" />
	</h3>
	<c:if test="${empty presidents }">
        No Presidents Found.
            </c:if>
	<c:if test="${not empty presidents }">
		<c:forEach var="p" items="${presidents}">
			<table>
				<tr>
					<td><a href="presidentInfo?termID=${p.termNumber}" >${p.firstName}</td>
					<td>${p.middleName}</td>
					<td>${p.lastName}</td></a>
				</tr>
			</table>
		</c:forEach>
	</c:if>
	<p>(Don't forget to add the taglib.)</p>
</body>
</html>