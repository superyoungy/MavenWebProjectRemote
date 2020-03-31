package com.yc.ShoppingCart.entity;

import java.security.PrivateKey;

public class Product {
    private String id;
    private String name;
    private String imagepath;
    private double price;
    private String desc;

    public Product(String id, String name, String imagepath, double price, String desc) {
        this.id = id;
        this.name = name;
        this.imagepath = imagepath;
        this.price = price;
        this.desc = desc;
    }
    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", imagepath='" + imagepath + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }
}
