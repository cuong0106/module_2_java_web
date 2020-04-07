<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 4/6/2020
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>từ điển</title>
</head>
<body>
<%@ include file="menu.jsp"%>
<form action="/kq_Tu_Dien" method="post">
    word:<input type="text" name="txtSearch" ><br>
    <input type="submit" value="Dich">
</form>
</body>
</html>

