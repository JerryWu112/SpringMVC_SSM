<%--
  Created by IntelliJ IDEA.
  User: 伍佳伟
  Date: 2022/2/6
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="/account/findAll">查询所有</a><br>
    <p>新增代码1</p>

    <form action="/account/saveAccount" method="post">
        姓名：<input type="text" name="name"><br>
        金额：<input type="text" name="money"><br>
        <input type="submit" name="添加"><br>
    </form>

</body>
</html>
