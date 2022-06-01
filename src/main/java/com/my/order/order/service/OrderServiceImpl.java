package com.my.order.order.service;

import com.my.order.order.entity.Order;
import com.my.order.order.orderDTO.OrderDTO;
import com.my.order.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service("orderService")
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;


    @Override
    @Transactional
    public void add(OrderDTO orderDTO) {
        Order order = new Order();
        order= Order.builder()
                .itemNo(orderDTO.getItemNo())
                .orderDate(orderDTO.getOrderDate())
                .address(orderDTO.getAddress())
                .priceSum(orderDTO.getPriceSum())
                .userNo(orderDTO.getUserNo())
                .build();
    }

    @Override
    public void delete(OrderDTO orderDTO) {
        orderRepository.deleteById(orderDTO.getOrderNo());
    }
}
