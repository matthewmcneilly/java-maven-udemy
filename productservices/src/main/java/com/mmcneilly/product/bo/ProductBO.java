package com.mmcneilly.product.bo;

import com.mmcneilly.product.dto.Product;

public interface ProductBO {

    public void create(Product product);

    public Product findProduct(int id);

}
