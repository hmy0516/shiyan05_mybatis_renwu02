package com.hanlu.mapper;

import com.hanlu.pojo.Orders;

/**
 * @author HMY
 * @date 2018/12/24-20:57
 */
public interface OrdersMapper {
    public Orders findOrderById(int id);
    public Orders findOrderById2(int id);
}
