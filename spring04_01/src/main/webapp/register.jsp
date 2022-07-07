<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/29
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/studentregisterservlet" method="post">
     学生名字： <input type="text" name="student_name"> <br>
     学生年龄： <input type="text" name="student_age"> <br>
     <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>



</body>
</html>
