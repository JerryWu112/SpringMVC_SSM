<%--
  Created by IntelliJ IDEA.
  User: 伍佳伟
  Date: 2022/2/6
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2>list列表</h2><br>

    <c:forEach items="${accounts}" var="account">
        ${account.name}
    </c:forEach>

</body>
</html>
