package com.my.order.order.service;

import com.my.order.order.entity.Order;
import com.my.order.order.orderDTO.OrderDTO;

public interface OrderService {

    //주문신청
    public void add(OrderDTO orderDTO);


}
