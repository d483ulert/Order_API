package com.my.order.basket.service;

import com.my.order.basket.entity.Basket;

public interface BasketService {

    //장바구니 추가
     void add(String itemNo, String userNo,String orderPrice);

    //장바구니에 상품이 중복일 경우
     long duplicate(String itemNo, String userNo);

}
