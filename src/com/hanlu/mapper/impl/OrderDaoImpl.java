package com.hanlu.mapper.impl;

import com.hanlu.mapper.OrdersMapper;
import com.hanlu.pojo.Orders;
import com.hanlu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author HMY
 * @date 2018/12/24-21:12
 */
public class OrderDaoImpl implements OrdersMapper {
    @Override
    public Orders findOrderById(int id) {
        SqlSession sqlSession = MybatisUtils.getSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        Orders order = ordersMapper.findOrderById(id);
        return order;
    }

    @Override
    public Orders findOrderById2(int id) {
        SqlSession sqlSession = MybatisUtils.getSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        Orders orderById2 = ordersMapper.findOrderById2(id);
        return orderById2;
    }
}
