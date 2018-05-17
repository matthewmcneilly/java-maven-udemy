package com.mmcneilly.product.dao;

import com.mmcneilly.product.dto.Product;

// Interface is a group of related methods with empty bodies 
// Specifies the behaviour that a class provides  
public interface ProductDAO {

    void create(Product product);

    Product read(int id);

    void update(Product product);

    void delete(int id);
}
