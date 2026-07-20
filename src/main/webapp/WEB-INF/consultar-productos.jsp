<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Matt
  Date: 17/07/2026
  Time: 02:23 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista Productos</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>Nombre</th>
        <th>Precio</th>
        <th>Descripción</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach items="${listaProductos}" var="miProducto" varStatus="status">
            <th scope="row">${status.count}</th>
            <td>${miProducto.nombre}</td>
            <td>${miProducto.precio}</td>
            <td>${miProducto.descripcion}</td>
        </c:forEach>
    </tr>
    </tbody>
</table>
</body>
</html>
