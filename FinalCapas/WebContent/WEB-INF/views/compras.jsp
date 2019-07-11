<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compras</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/saveCompra">
	<select name = "producto">
		<c:forEach items = "${productos}" var = "p">
			<option value="${p.cProducto}" label= "${p.pNombre}"></option>
		</c:forEach>
	</select>
	<select name = "cliente">
		<c:forEach items="${clientes}" var="c">
			<option value="${c.cCliente}" label="${c.cNombres}">
		</c:forEach>
	</select>
	<label>Cantidad</label>
	<input type="text" name ="cantidad">
	
	<input type="submit" value="Realizar Compra">
	
	</form>
</body>
</html>