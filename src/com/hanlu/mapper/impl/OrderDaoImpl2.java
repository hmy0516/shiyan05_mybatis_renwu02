package com.hanlu.mapper.impl;

import com.hanlu.mapper.Orders2Mapper;
import com.hanlu.mapper.OrdersMapper;
import com.hanlu.pojo.Orders;
import com.hanlu.pojo.Orders2;
import com.hanlu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author HMY
 * @date 2018/12/24-21:12
 */
public class OrderDaoImpl2 implements Orders2Mapper {
    @Override
    public Orders2 findOrderById(int id) {
        SqlSession sqlSession = MybatisUtils.getSession();
        Orders2Mapper orders2Mapper = sqlSession.getMapper(Orders2Mapper.class);
        Orders2 order2 = orders2Mapper.findOrderById(id);
        return order2;
    }
    @Override
    public Orders2 findOrdersById1(int id) {
        SqlSession sqlSession = MybatisUtils.getSession();
        Orders2Mapper orders2Mapper = sqlSession.getMapper(Orders2Mapper.class);
        Orders2 order2 = orders2Mapper.findOrdersById1(id);
        return order2;
    }
    @Override
    public Orders2 findOrdersById2(int id) {
        SqlSession sqlSession = MybatisUtils.getSession();
        Orders2Mapper orders2Mapper = sqlSession.getMapper(Orders2Mapper.class);
        Orders2 order2 = orders2Mapper.findOrdersById1(id);
        return order2;
    }

}
