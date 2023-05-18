<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/17/2023
  Time: 8:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Các spice đã chọn</h2>
<c:forEach items="${result}" var="item">
    <p>${item}</p>
</c:forEach>

</body>
</html>
