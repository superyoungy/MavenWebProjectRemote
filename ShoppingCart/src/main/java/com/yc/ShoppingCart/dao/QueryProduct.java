package com.yc.ShoppingCart.dao;

import com.yc.ShoppingCart.entity.Item;
import com.yc.ShoppingCart.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface QueryProduct {
    public List<Product> QueryAll() ;
    public Product QueryProductById(String id);
}
