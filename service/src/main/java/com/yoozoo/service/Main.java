package com.yoozoo.service;


import com.yoozoo.api.IProductService;
import com.yoozoo.api.bean.Product;

/**
 * Created by uwangshan@163.com on 2018/9/30.
 */
public class Main {
    public static void main(String[] args) {
        IProductService productService = (IProductService) com.yoozoo.api.Main.rpc(IProductService.class);
        Product product = productService.queryById(1025);
        System.out.println(product);
    }
}
