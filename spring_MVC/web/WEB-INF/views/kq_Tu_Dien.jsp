<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 4/6/2020
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="menu.jsp"%>
<h1>word:${word}</h1>
<h2>Mean:${result}</h2>
<h1 style="color: red">${error}</h1>
</body>
</html>
