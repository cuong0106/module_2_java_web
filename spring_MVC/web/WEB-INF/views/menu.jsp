<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 4/6/2020
  Time: 6:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/chon_menu" meathod="post">
<li>
    <ul><input type="submit" name="chuong_Trinh" placeholder="RATE" value="index"/> greeting<br/></ul>
    <ul><input type="submit" name="chuong_Trinh" placeholder="RATE" value="tu_Dien"/> tu_Dien<br/></ul>
    <ul><input type="submit" name="chuong_Trinh" placeholder="RATE" value="chuyen_Doi_Tien_Te"/> chuyen_Doi_Tien_Te<br/></ul>
</li>
</form>

</body>
</html>
