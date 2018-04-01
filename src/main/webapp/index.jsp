<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Тестовое задание СДЭК</title>
</head>
<body>

<form:form method="post" action="search" modelAttribute="user">
    <table>
        <tr>
            <td>Поиск по имени: </td>
            <td><form:input path="name"/></td>
            <td><input id="search" type="submit" value="Искать"/></td>
        </tr>
    </table>
</form:form>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
        </tr>
    </c:forEach>
</table>
<a href="newUser">Добавить</a>
</body>