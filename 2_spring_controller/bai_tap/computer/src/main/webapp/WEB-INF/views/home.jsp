<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Caculator</h1>
    <form action="caculator" method="post">
        <input type="text" name="item1" value="${item1}">
        <input type="text" name="item2" value="${item2}"><br><br>
        <button type="submit" value="+" name="calculation">Additon(+)</button>
        <button type="submit" value="-" name="calculation">Subtraction(-)</button>
        <button type="submit" value="*" name="calculation">Multiplication(*)</button>
        <button type="submit" value="/" name="calculation">Division(/)</button>
    </form>
    <p>Result: ${result}</p>
</body>
</html>