<%--
  Created by IntelliJ IDEA.
  User: wqh
  Date: 2018/3/1
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="success.jsp">

    用户名： <input type="text" name="username"/><br>
    密 码： <input type="password" name="password"/><br>
    验证码： <input type="text" name="codeForRegister"/><img src="/ServletRandomPicture"
    <%--onclick="this.src=this.src+'?'+new Date().getTime()"
    第一个this是表示当前的img标签 的src属性 等于一个新的对象的src 后面加上时间导致时间不同就会向服务器拿数据
    --%>
      onclick="this.src=this.src+'?'+new Date().getTime()" alt="看不清楚换一张" style="cursor: hand"><br>
    <%--实现点图片就换一张--%>
</form>
</body>
</html>
