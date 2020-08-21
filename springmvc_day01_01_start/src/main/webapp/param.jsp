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
<%--请求参数绑定--%>
<%--<a href="/param/testParam?username=boston&password=123">请求参数绑定</a>--%>

<%--请求参数封装到实体类 name属性和javabean中name一致
        引用类型封装:
            当请求参数包含其他实体类的参数封装时，用当前实体类对象.属性赋值--%>
<form action="param/saveAccount" method="post">
    账户姓名:<input type="text" name="username"/><br>
    账户密码:<input type="password" name="password"/><br>
    账户金额:<input type="number" name="money"/><br>
    用户姓名:<input type="text" name="user.uname"/><br>
    用户年龄:<input type="number" name="user.age"/><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
