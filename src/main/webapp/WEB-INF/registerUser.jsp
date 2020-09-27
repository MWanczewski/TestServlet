<%--
  Created by IntelliJ IDEA.
  User: Gabi
  Date: 27.09.2020
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action = "register" method="post">
        <div>
            <input name = "login" placeholder="login" type="text" required>
        </div>
        <br>
        <div>
            <input name = "email" placeholder="email" type="email" required>
        </div>
        <br>
        <div>
            <input name = "password" placeholder="password" type="password" required>
        </div>
        <br>
        <div>
            <input name = "repeatedPassword" placeholder="confirm password" type="password" required>
        </div>
        <br>
        <div>
            <button type="submit">Sign up</button>
        </div>
    </form>

</body>
</html>
