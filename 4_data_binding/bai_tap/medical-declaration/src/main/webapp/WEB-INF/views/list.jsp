<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }

        table {
            border-collapse: collapse;
        }
    </style>

</head>
<body>
<table>
    <tr>
        <td>Họ tên</td>
        <td>Năm sinh</td>
        <td>Giới tính</td>
        <td>Quốc tịch</td>
        <td>CMND</td>
        <td>Phương tiện đi lại</td>
        <td>Số hiệu phương tiện</td>
        <td>Số ghế</td>
        <td>Ngày khởi hành</td>
        <td>Ngày kết thúc</td>
        <td>Địa chỉ liên lạc</td>
        <td>Điện thoại</td>
        <td>Email</td>
    </tr>
    <tr>
        <c:forEach items="${declaration}" var="d">
            <td>
                <td>${d.name}</td>
                <td>${d.dayOfBirth}</td>
                <td>${d.gender}</td>
                <td>${d.nationality}</td>
                <td>${d.idPeople}</td>
                <td>${d.vehicle}</td>
                <td>${d.idCar}</td>
                <td>${d.numberSeats}</td>
                <td>${d.departureDate}</td>
                <td>${d.endDate}</td>
                <td>${d.address}</td>
                <td>${d.phoneNumber}</td>
                <td>${d.email}</td>
            </td>
        </c:forEach>
    </tr>
</table>


</body>
</html>





