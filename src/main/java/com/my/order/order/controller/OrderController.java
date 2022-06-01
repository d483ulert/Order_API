package com.my.order.order.controller;

import com.my.order.item.entity.Item;
import com.my.order.order.orderDTO.OrderDTO;
import com.my.order.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class OrderController {

    private final OrderService orderService;

    @PostMapping("buy")
    public void orderBuy(OrderDTO orderDTO) {
        int cnt=0;
        Item item =new Item();


        orderService.add(orderDTO);
    }

    @PostMapping("cancle")
    public void orderCancle(){

    }
}
