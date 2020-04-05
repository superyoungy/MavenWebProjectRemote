<%--
  Created by IntelliJ IDEA.
  User: superyoungy
  Date: 2020/3/28
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="d" uri="http://www.com.yc/jsp/jstl/mine/functions" %>
<html>
<head>
    <title>商品详情</title>
</head>
<body>
    <img src="/ShoppingCart/images/${requestScope.product.imagepath}"><br/>
    ${"商品编号:"}${requestScope.product.id}<br/>
    ${"商品名称:"}${requestScope.product.name}<br/>
    ${"商品价格:"}${d:double2TargetedPrecision(requestScope.product.price,2)}<br/>
    ${"商品描述:"}${requestScope.product.desc}<br/><br/>
    <a href="addToCart?id=${requestScope.product.id}"><img src="/ShoppingCart/images/cart.png"></a><br/><br/>
    <hr/>
    <a href="/ShoppingCart/showProducts">${"返回商城"}<a/>
</body>
</html>
