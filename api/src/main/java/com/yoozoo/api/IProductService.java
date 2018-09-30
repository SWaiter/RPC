package com.yoozoo.api;

import com.yoozoo.api.bean.Product;

/**
 * Created by uwangshan@163.com on 2018/9/30.
 */
public interface IProductService {
    public Product queryById(long id);
}
