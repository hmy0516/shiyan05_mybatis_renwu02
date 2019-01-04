package com.hanlu.test;

import com.hanlu.mapper.OrdersMapper;
import com.hanlu.mapper.impl.OrderDaoImpl;
import org.junit.Test;

/**
 * @author HMY
 * @date 2018/12/24-21:21
 */
public class OrdersTest {
    @Test
    public void findOrderById2(){
        OrdersMapper ordersMapper = new OrderDaoImpl();
        System.out.println(ordersMapper.findOrderById2(1));
    }
}
