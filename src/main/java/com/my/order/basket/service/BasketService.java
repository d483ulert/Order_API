package com.my.order.basket.service;

import com.my.order.basket.entity.Basket;

public interface BasketService {

    public void add(Basket basket, Long itemNo, Long userNo);
}
