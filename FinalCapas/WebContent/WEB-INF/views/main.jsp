<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Principal</title>
</head>
<body>
	<button type="button" onclick="location.href='${pageContext.request.contextPath}/crearCompra'">Crear Compra</button><br><br>
	<button type="button" onclick="location.href='${pageContext.request.contextPath}/verComprasCliente'">Ver compras de cliente</button><br><br>
	<select>
		<c:forEach items="${clientes}" var="c">
			<option value="${c.cCliente}" label="${c.cNombres} ${c.cApellidos}">
		</c:forEach>
	</select>
</body>
</html>