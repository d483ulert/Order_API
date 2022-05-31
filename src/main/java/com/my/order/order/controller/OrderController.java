package com.my.order.order.controller;

import com.my.order.item.service.ItemService;
import com.my.order.order.service.OrderService;
import com.my.order.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class OrderController {

    private final OrderService orderService;
    private final ItemService itemService;
    private final UserService userService;


    @PostMapping("basketAdd")
    public void basketAdd(Long itemNo,Long userNo){

    }

    @PostMapping("basketCancle")
    public void basketCancle(){

    }

    @PostMapping("buy")
    public void orderBuy(){

    }

    @PostMapping("cancle")
    public void orderCancle(){

    }
}
