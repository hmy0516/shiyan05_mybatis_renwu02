package com.hanlu.test;

import com.hanlu.mapper.Orders2Mapper;
import com.hanlu.mapper.OrdersMapper;
import com.hanlu.mapper.impl.OrderDaoImpl;
import com.hanlu.mapper.impl.OrderDaoImpl2;
import com.hanlu.pojo.Orders2;
import org.junit.Test;

/**
 * @author HMY
 * @date 2018/12/24-21:21
 */
public class Orders2Test {
    @Test
    public void findOrderById1(){
        Orders2Mapper orders2Mapper = new OrderDaoImpl2();
        System.out.println(orders2Mapper.findOrdersById1(1));
    }
    @Test
    public void findOrderById2(){
        Orders2Mapper orders2Mapper = new OrderDaoImpl2();
        System.out.println(orders2Mapper.findOrdersById2(1));
    }
}
