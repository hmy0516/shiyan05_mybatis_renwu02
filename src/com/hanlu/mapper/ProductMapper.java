package com.hanlu.mapper;

import com.hanlu.pojo.Product;

/**
 * @author HMY
 * @date 2018/12/24-21:37
 */
public interface ProductMapper {
    public Product findProductById(int id);
    public Product findProductById2(int id);
}
