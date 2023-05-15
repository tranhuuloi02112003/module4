<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="dictionary" method="post">
    <h1>Dictionary</h1>
    <label>English:</label>
    <input type="text" name="english" value="${english}">
    <label>Vns: ${vns}</label>
    <input type="submit" value="Change">
</form>

</body>
</html>