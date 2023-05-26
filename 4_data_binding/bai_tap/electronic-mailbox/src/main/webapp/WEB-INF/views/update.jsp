<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Update</h3>
<form:form modelAttribute="mailBox" action="/mailBox/update"  method="post">
<table>
    <tr>
        <td>Languages:</td>
        <td>
            <form:select path="languages">
                <form:options items="${listLanguages}"/>
            </form:select>
        </td>
    </tr>
    <tr>
        <td>Page size:</td>
        <td>Show
            <form:select path="pageSize">
                <form:options items="${listPageSize}"/>
            </form:select>
            emails per page
        </td>
    </tr>
    <tr>
        <td>Spams filter:</td>
        <td><form:radiobutton path="spamsFilter" /> Enable spams fiter</td>
    </tr>
    <tr>
        <td>Signature:</td>
        <td><form:input path="signature" /></td>
    </tr>
    <tr>
        <td><button type="submit">Update</button></td>
    </tr>
</table>
</form:form>
</body>
</html>
