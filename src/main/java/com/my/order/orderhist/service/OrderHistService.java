package com.my.order.orderhist.service;


import com.my.order.orderhist.entity.OrderHIst;

public interface OrderHistService {

    public void add(OrderHIst orderHIst,Long orderNo, Long itemNo, Long userNo,String userId);
}
