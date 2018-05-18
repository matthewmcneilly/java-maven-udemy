package com.mmcneilly.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.mmcneilly.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {

    // Map is a set of key and value pairs 
    Map<Integer, Product> products = new HashMap<Integer, Product>();

    // Methods linked with the interface
    public void create(Product product) {
        // TODO Auto-generated method stub
        products.put(product.getId(), product);

    }

    public Product read(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public void update(Product product) {
        // TODO Auto-generated method stub

    }

    public void delete(int id) {
        // TODO Auto-generated method stub

    }

}
