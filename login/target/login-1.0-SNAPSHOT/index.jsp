<%--
  Created by IntelliJ IDEA.
  User: superyoungy
  Date: 2020/4/1
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>login</title>
    <script type="text/javascript">
        function refresh(){
            var code=document.getElementById("vertificationCode");
            code.src="${pageContext.request.contextPath}/vertificationCodeImage?"+new Date().getTime();
        }
    </script>
</head>
<body>
<span style="color: red">${requestScope.info}</span>
<form action="loginCheck" method="post">
    <table>
        <tr><td> 用户名：</td><td><input type="text" name="username" value="${cookie.username.value}"/></td></tr>
        <tr><td> 密码:</td><td><input type="text" name="password" value="${cookie.password.value}"/></td></tr>
        <tr><td>二维码：</td><td><input type="text" name="vertificationCodeInput"/></td></tr>
        <td colspan="2" align="right"><img id="vertificationCode" src="${pageContext.request.contextPath}/vertificationCodeImage"><a href="javascript:refresh()">看不清楚，换一张</a></td>
        <tr><td colspan="2">记住我<input type="checkbox" name="flag" value="true"/></td></tr>
        <tr><td colspan="2"><input type="submit" value="login"/></td></tr>
    </table>
</form>
</body>
</html>
