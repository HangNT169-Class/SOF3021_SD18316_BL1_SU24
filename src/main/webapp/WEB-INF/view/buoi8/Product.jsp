<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Product Code</th>
        <th>Product Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Cate code</th>
        <th>Cate name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="CT" items="${list}">
        <tr>
            <td>${CT.id}</td>
            <td>${CT.code}</td>
            <td>${CT.name}</td>
            <td>${CT.price}</td>
            <td>${CT.description}</td>
            <td>${CT.cate.categoryCode}</td>
            <td>${CT.cate.categoryName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>