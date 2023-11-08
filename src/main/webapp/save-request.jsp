<%--
  Created by IntelliJ IDEA.
  User: MrBarmalej
  Date: 08.11.2023
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ввод заявки</title>
</head>
<body>
<h1>Ввод заявки</h1>
<form action="/Lesson26/SaveRequestServlet.java" method="post">
    Имя: <input type="text" name="name" required><br>
    Электронная почта: <input type="email" name="email" required><br>
    Описание заявки: <textarea name="description" required></textarea><br>
    <input type="submit" value="Отправить заявку">
</form>
</body>
</html>