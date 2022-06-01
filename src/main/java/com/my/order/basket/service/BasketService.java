package com.my.order.basket.service;

import com.my.order.basket.entity.Basket;

import java.util.List;

public interface BasketService {

    List<Basket> List(String userNo);

    //장바구니 추가
     void Add(Long itemNo, Long userNo,String orderPrice);

    //장바구니에 상품이 중복일 경우
     long Duplicate(Long itemNo, Long userNo);

     //장바구니 삭제
     void Delete(Long basketNo);

}
