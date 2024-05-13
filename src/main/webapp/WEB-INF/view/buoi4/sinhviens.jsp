<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <form action="">
        Tên: <input name="ten"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/sinh-vien/view-add">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSinhVien}" var="list" varStatus="i">
        <tr>
            <td>${i.index+1}</td>
            <td>${list.mssv}</td>
            <td>${list.ten}</td>
            <td>${list.tuoi}</td>
            <td>${list.diaChi}</td>
            <td>${list.gioiTinh}</td>
            <td colspan="2">
                <a href="">Them</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
