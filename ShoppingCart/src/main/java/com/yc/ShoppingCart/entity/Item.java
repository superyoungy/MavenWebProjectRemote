package com.yc.ShoppingCart.entity;
//条目类，记录购物车中的一条记录
public class Item {
    private int id;//条目编号
    private  Product product;
    private int number=1;//购买商品的数量，默认1件
    private  double sumMoney;

    public Item(int id, Product product, int number, double sumMoney) {
        this.id = id;
        this.product = product;
        this.number = number;
        this.sumMoney = sumMoney;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSumMoney() {
        return this.number*this.product.getPrice();
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

}
