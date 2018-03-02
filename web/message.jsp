<%--
  Created by IntelliJ IDEA.
  User: wqh
  Date: 2018/3/1
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>跳转页面</title>
</head>
<body>

        <%
            String message = (String)application.getAttribute("message");
            out.write(message);
        %>

</body>
</html>
