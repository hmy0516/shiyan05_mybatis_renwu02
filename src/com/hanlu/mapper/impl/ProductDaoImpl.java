package com.hanlu.mapper.impl;

import com.hanlu.mapper.PersonMapper;
import com.hanlu.mapper.ProductMapper;
import com.hanlu.pojo.Product;
import com.hanlu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author HMY
 * @date 2018/12/24-21:58
 */
public class ProductDaoImpl implements ProductMapper {
    @Override
    public Product findProductById(int id) {
        Product product = null;
        try {
            SqlSession sqlSession = MybatisUtils.getSession();
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            product = productMapper.findProductById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtils.closeSession();
        }
        return product;
    }

    @Override
    public Product findProductById2(int id) {
        Product product = null;
        try {
            SqlSession sqlSession = MybatisUtils.getSession();
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            product = productMapper.findProductById2(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtils.closeSession();
        }
        return product;
    }
}
