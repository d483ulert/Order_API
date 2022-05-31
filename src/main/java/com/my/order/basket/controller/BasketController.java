package com.my.order.basket.controller;

import com.my.order.basket.dto.BasketDTO;
import com.my.order.basket.service.BasketService;
import com.my.order.item.service.ItemService;
import com.my.order.order.service.OrderService;
import com.my.order.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@RequiredArgsConstructor
@Controller
public class BasketController {

    private final OrderService orderService;
    private final ItemService itemService;
    private final UserService userService;
    private final BasketService basketService;

    @PostMapping("basketAdd")
    public void basketAdd(String itemNo,String userNo,String orderPrice){
        // 상품이 이미 장바구니에 존재할경우
        BasketDTO basketDTO =new BasketDTO();
        basketDTO.setBasketNo(basketService.duplicate(itemNo,userNo));
        if(basketDTO.getBasketNo()==1){
            log.info("장바구니 중복");
        }else{
            basketService.add(itemNo,userNo,orderPrice);
        }

    }

    @PostMapping("basketCancle")
    public void basketCancle(){

    }

}
