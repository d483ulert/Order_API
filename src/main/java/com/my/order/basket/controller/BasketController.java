package com.my.order.basket.controller;

import com.my.order.basket.dto.BasketDTO;
import com.my.order.basket.service.BasketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller
@RequestMapping("/basket")
public class BasketController {

    private final BasketService basketService;

    @GetMapping("/list")
    public String BasketList(Model model){
        //세션에서 현재 User정보를 가져와 userNo값을 넣어줌.
        model.addAttribute("data",basketService.list(userNo));

        return"view";
    }


    @PostMapping("/add")
    public void BasketAdd(@RequestBody Long itemNo, @RequestBody Long userNo, @RequestBody String orderPrice){
        // 상품이 이미 장바구니에 존재할경우
        BasketDTO basketDTO =new BasketDTO();
        basketDTO.setBasketNo(basketService.Duplicate(itemNo,userNo));
        if(basketDTO.getBasketNo()==1){
            //"장바구니에 이미 상품이 있습니다 추가하시겠습니까?" 알림창
        }else{
            basketService.Add(itemNo,userNo,orderPrice);
        }

    }

    @PostMapping("/delete/{basketNo}")
    public void BasketDelete(@PathVariable Long basketNo){
        basketService.Delete(basketNo);
    }

}
