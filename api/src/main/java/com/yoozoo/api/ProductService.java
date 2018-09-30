package com.yoozoo.api;

import com.yoozoo.api.bean.Product;

/**
 * Created by uwangshan@163.com on 2018/9/30.
 */
public class ProductService implements IProductService{
    @Override
    public Product queryById(long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("wangshan");
        product.setPrice(12211.2125);
        return product;
    }
}
