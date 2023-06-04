<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/30/2023
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h4 style="text-align: center">TỜ KHAI Y TẾ</h4>
  <p style="text-align: center">Đây là tài liệu quan trọng, thông tin của anh/chị sẽ giúp cơ quan y tế liên lạc khi cần thiết để phòng chống dịch
    bệnh truyền nhiềm </p>
  <p style="color: red;text-align: center">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</p>
  <form:form method="post" action="/declatation" modelAttribute="declaration">
    <div>
      <lable> Họ tên(GHI CHỮ IN HOA)(*)</lable>
      <form:input path="name"></form:input>
    </div>
    <div>
      <div>
        <lable> Năm sinh(*)</lable>
        <form:input path="dayOfBirth"></form:input>
      </div>
      <div>
        <lable> Giới tính(*)</lable>
        <form:input path="gender"></form:input>
      </div>
      <div>
        <lable>Quốc tịch(*)</lable>
        <form:input path="nationality"></form:input>
      </div>


    </div>

</form:form>

</body>
</html>
