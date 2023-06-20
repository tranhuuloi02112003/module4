<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<p>Họ tên: ${declaration.name}</p>
<p>Năm sinh: ${declaration.dayOfBirth}</p>
<p>Giới tính: ${declaration.gender}</p>
<p>Quốc tịch: ${declaration.nationality}</p>
<p>Số hộ chiếu hoặc CMND: ${declaration.idCard}</p>
<p>Thông tin đi lại: ${declaration.vehicle}</p>
<p>Số hiệu phương tiện: ${declaration.idVehicle}</p>
<p>Số ghế: ${declaration.chair}</p>
<p>Ngày khởi hành: ${declaration.dayComeBack}</p>
<p>Ngày kết thúc: ${declaration.dayComeOut}</p>
<p>Trong vòng 14 ngày, Anh/chị có đến tỉnh thành nào không?: ${declaration.reason}</p>
</body>
</html>