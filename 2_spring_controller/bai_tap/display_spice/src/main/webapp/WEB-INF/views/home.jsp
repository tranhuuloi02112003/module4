<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1 style="text-align: center">Sandwich Condiments</h1>
<form action="sandwich" method="post">
    <option id="item1" value="Lettuce" name="condiment"></option>
    <label for="item1">Rau xà lách</label><br>
    <option id="item2" value="Tomato" name="condiment"></option>
    <label for="item2">Cà chua</label><br>
    <option id="item3" value="Lettuce" name="condiment"></option>
    <label for="item3">Rau xà lách</label><br>
    <option id="item4" value="Tomato" name="condiment"></option>
    <label for="item4">Cà chua</label><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>