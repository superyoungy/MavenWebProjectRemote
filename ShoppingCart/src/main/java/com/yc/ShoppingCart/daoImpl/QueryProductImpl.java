package com.yc.ShoppingCart.daoImpl;

import com.yc.ShoppingCart.dao.QueryProduct;
import com.yc.ShoppingCart.entity.Product;

import java.util.ArrayList;
import java.util.List;
//查询商品
public class QueryProductImpl implements QueryProduct {
    //将数据放入静态区模拟数据库
    private static List<Product> list= new ArrayList<Product>();
    static {
        list.add(new Product("10001","Java编程思想","1.png",89.1,"学习Java的经典书籍！"));
        list.add(new Product("10002","JavaWeb技术开发","2.png",54,"学习JavaWeb的经典书籍！"));
        list.add(new Product("10003","SSM框架整合开发","3.png",65,"学习SSM整合的经典书籍！"));
        list.add(new Product("10004","SpringBoot企业级开发","4.png",89.1,"学习SpringBoot的经典书籍！"));
        list.add(new Product("10005","Python从入门到精通","5.png",78,"学习Python的经典书籍！"));
        list.add(new Product("10006","Oracle数据库","6.png",85.3,"学习Oracle的经典书籍！"));
        list.add(new Product("10007","MySQL数据库","7.png",64,"学习MySQL的经典书籍！"));
        list.add(new Product("10008","Web前端","8.png",94.8,"学习Web的经典书籍！"));
    }
    @Override
    public List<Product> QueryAll() {
        return list;
    }

    @Override
    public Product QueryProductById(String id) {
        Product p=null;
        for(Product product:list) {
            if(id.equals(product.getId())) {
                p=product;
                break;
            }
        }
        return p;
    }
}
