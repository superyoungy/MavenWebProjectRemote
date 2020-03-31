package com.yc.ShoppingCart.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    private double totalSumMoney=0;

    public ShoppingCart(List<Item> items, double totalSumMoney) {
        this.items = items;
        this.totalSumMoney = totalSumMoney;
    }

    public ShoppingCart() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalSumMoney() {
        double sum=0;
        for(Item item:items) {
            sum+=item.getSumMoney();
        }
        return sum;
    }

    public void setTotalSumMoney(double totalSumMoney) {
        this.totalSumMoney = totalSumMoney;
    }

    //将商品包装成条目，如果传入的Product在ShoppingCartt中已存在，则条目的数量+1
    public void addToCart(Product product) {
        boolean flag=false;
        for(Item item:this.items) {
            if(product.getId().equals(item.getProduct().getId())) {
                item.setNumber(item.getNumber()+1);
                flag=true;
                break;
            }
        }
        if(!flag) {
            Item item=new Item();
            item.setId(this.items.size()+1);
            item.setProduct(product);
            this.items.add(item);
        }
    }

    //删除条目item
    public void removeFromCart(Product product) {
        for(Item item:this.items) {
            if(item.getProduct().getId().equals(product.getId())) {
                this.items.remove(item);
                break;
            }
        }
    }
}
