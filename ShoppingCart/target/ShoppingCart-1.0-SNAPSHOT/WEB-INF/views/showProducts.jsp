<%--
  Created by IntelliJ IDEA.
  User: superyoungy
  Date: 2020/3/28
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%--显示全部商品信息--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="d" uri="http://www.com.yc/jsp/jstl/mine/functions" %>
<html>
<head>
    <title>商品页</title>
</head>
<body>
    <table border="1", align="center">
        <a href="showCart"><span style="color: red; ">${"我的购物车"}[${sessionScope.cart.items.size()}]</span></a>
        <tr><th>商品编号</th><th>商品名称</th><th>商品价格</th><th>商品描述</th><th></th></tr>
        <%--显示每一件商品的信息，将商品id放到request域中，发送到controller--%>
        <c:forEach items="${requestScope.products}" var="keyword" varStatus="id">
            <tr><td>${keyword.id}</td><td>${keyword.name}</td><td>${d:double2TargetedPrecision(keyword.price,2 )}</td><td>${keyword.desc}</td><td><a href="showProductDetails?id=${keyword.id}"><span
                    style="color: green; ">查看商品详情</span></a></td></tr>
        </c:forEach>
    </table>
    <hr/>
    已浏览过的商品如下：<br/>${cookie.ids.value}
</body>
</html>
