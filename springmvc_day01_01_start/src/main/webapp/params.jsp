<%--
  Created by IntelliJ IDEA.
  User: Boston
  Date: 2020/7/22
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--把请求参数封装到Account2实体类中，类中存在List和Map集合
<form action="param/saveAccount2" method="post">
    账户姓名:<input type="text" name="username"/><br>
    账户密码:<input type="password" name="password"/><br>
    账户金额:<input type="number" name="money"/><br>

    用户姓名:<input type="text" name="userList[0].uname"/><br>
    用户年龄:<input type="number" name="userList[0].age"/><br>

    用户姓名:<input type="text" name="userMap['map'].uname"/><br>
    用户年龄:<input type="number" name="userMap['map'].age"/><br>
    <input type="submit" value="提交"/>--%>

<%--自定义类型转换器
<form action="param/saveUser" method="post">
    用户姓名:<input type="text" name="uname"/><br>
    用户年龄:<input type="number" name="age"/><br>
    日期:<input type="text" name="date"/>
    <input type="submit" value="提交"/>--%>

<a href="/param/testServletAPI">ServletAPI</a>
</form>
</body>
</html>
