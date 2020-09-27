<%--
  Created by IntelliJ IDEA.
  User: Gabi
  Date: 27.09.2020
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>USERS</title>
</head>
<body>
<c:forEach items="${users}" var="user">
    <div>
        <p><strong>user.login</strong></p><br>
        <p><strong>user.email</strong></p><br>
    </div>
    <hr>
    <br>
</c:forEach>


</body>
</html>
