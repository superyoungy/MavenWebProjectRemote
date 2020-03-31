<%@ page import="java.text.DecimalFormat" %><%--
  Created by IntelliJ IDEA.
  User: superyoungy
  Date: 2020/3/30
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我的购物车</title>
    <style>
        body{text-align: center}
    </style>
    <script src="../accounting.js"></script>
</head>
<body>
    <table border="1" align="center">
    <tr><th>条目编号</th><th>商品名称</th><th>商品价格</th><th>商品数量</th><th>条目总金额</th></tr>
    <c:forEach items="${sessionScope.cart.items}" var="item" varStatus="id">
        <tr><td>${id.count}</td><td>${item.product.name}</td><td>${item.product.price}</td><td>${item.number}</td><td>${item.sumMoney}</td></tr>
    </c:forEach>
    <tr><td colspan="5" align="right">${sessionScope.cart.totalSumMoney}</td></tr>
    </table>
    <a href="showProducts">继续购物</a>|<a href="">结账</a>
</body>
</html>