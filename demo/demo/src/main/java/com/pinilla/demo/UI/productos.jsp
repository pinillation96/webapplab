<!-- productos.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Productos</title>
</head>
<body>
    <h1>Lista de productos</h1>
    <ul>
        <c:forEach items="${productos}" var="producto">
            <li>${producto.nombre} - ${producto.precio}</li>
        </c:forEach>
    </ul>
</body>
</html>
