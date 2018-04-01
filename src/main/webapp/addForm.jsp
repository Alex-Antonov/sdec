<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Тестовое задание СДЭК</title>
</head>
<body>
    <form:form method="post" action="add" modelAttribute="user">
        <table>
            <tr>
                <td>Имя: </td>
                <td><form:input path="name" /></td>
                <td><input type="submit" value="Добавить" /></td>
            </tr>
            <tr>
                <td><a href="index">Назад</a></td>
            </tr>
        </table>
    </form:form>
</body>
</html>