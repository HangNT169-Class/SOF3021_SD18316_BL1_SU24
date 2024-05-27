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
        <th>Category Code</th>
        <th>Category Name</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="CT" items="${lists1}">
        <tr>
            <td>${CT.id}</td>
            <td>${CT.categoryCode}</td>
            <td>${CT.categoryName}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
