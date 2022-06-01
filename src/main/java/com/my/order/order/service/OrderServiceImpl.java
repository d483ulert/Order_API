package com.my.order.order.service;

import com.my.order.order.entity.Order;
import com.my.order.order.orderDTO.OrderDTO;
import com.my.order.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service("orderService")
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;


    @Override
    public void add(OrderDTO orderDTO) {
        Order order = new Order();
        order= Order.builder()
                .itemNo(orderDTO.getItemNo().toString())
                .orderDate(orderDTO.getOrderDate())
                .address(orderDTO.getAddress())
                .priceSum(orderDTO.getPriceSum())
                .userNo(orderDTO.getUserNo().toString())
                .build();
    }
}
