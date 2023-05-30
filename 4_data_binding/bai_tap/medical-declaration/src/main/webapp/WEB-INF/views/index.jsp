<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>TỜ KHAI Y TẾ</h2>
<p>Đây là tài liệu quan trọng, thông tin của anh/chị sẽ giúp cơ quan y tế liên lạc khi cần thiết để phòng chống dịch
    bệnh truyền nhiềm </p>
<p style="color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</p>
<form:form method="post" action="/declatation" modelAttribute="declatation">
    <div>
        <lable> Họ tên(GHI CHỮ IN HOA)(*)</lable>
        <form:input path=""
    </div>


</form:form>


</body>
</html>