package com.hanlu.test;

import com.hanlu.mapper.ProductMapper;
import com.hanlu.mapper.impl.ProductDaoImpl;
import com.hanlu.pojo.Product;
import org.junit.Test;

/**
 * @author HMY
 * @date 2018/12/24-22:00
 */
public class ProductTest {
    @Test
    public void findProductById(){
        ProductMapper productMapper = new ProductDaoImpl();
        Product product = productMapper.findProductById(1);
        System.out.println(product);
    }
    @Test
    public void findProductById2(){
        ProductMapper productMapper = new ProductDaoImpl();
        Product product = productMapper.findProductById2(1);
        System.out.println(product);
    }
}
