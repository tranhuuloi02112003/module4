<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
    <style>
        body{
            font-size: 25px;
        }
    </style>
</head>
<body>
<form action="currency" method="post">
    <div>
        <p>Chuyển đổi tiền tệ</p>
    </div>
    <div>
        <label>Usd:</label>
        <input type="text" name="usd" value="${usd}">
    </div>
    <div>
        <label>Result: </label>
        <label>${result} Vnđ</label>
    </div>
    <div>
        <input type="submit" value="change">
    </div>
</form>
</body>
</html>