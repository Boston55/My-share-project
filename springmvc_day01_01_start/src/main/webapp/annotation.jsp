<%--
  Created by IntelliJ IDEA.
  User: Boston
  Date: 2020/7/23
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3></h3>
    <a href="anno/testRequestParam?name=itheima">RequestParam</a>

    <br>
    <form action="/anno/testRequestBody" method="post">
        用户姓名:<input type="text" name="username"/><br>
        用户年龄:<input type="number" name="age"/><br>
        <input type="submit" value="提交"/>
    </form>

    <a href="anno/testPathVariable/10">PathVariable</a>
    <br>

    <br>
    <form action="/anno/testModelAttribute" method="post">
        用户姓名:<input type="text" name="uname"/><br>
        用户年龄:<input type="number" name="age"/><br>
        <input type="submit" value="提交"/>
    </form>

    <a href="anno/testSessionAttributes">SessionAttributes</a>
    <br>
    <a href="anno/testgetSessionValue">getSessionValue</a>
    <br>
    <a href="anno/testdeleteSessionValue">deleteSessionValue</a>
    <br>
</body>
</html>
