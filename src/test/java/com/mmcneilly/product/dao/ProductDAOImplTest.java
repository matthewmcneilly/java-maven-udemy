package com.mmcneilly.product.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.mmcneilly.product.dto.Product;

public class ProductDAOImplTest {

    @Test
    public void createShouldCreateAProduct() {
        ProductDAO dao = new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("abc");
        product.setDescription("Maven is awesome!!");
        product.setPrice(800);
        dao.create(product);

        Product result = dao.read(1);

        assertNotNull(result);
        assertEquals("abc", result.getName());
    }
}
