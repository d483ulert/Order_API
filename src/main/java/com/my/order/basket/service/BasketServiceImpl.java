package com.my.order.basket.service;

import com.my.order.basket.entity.Basket;
import com.my.order.basket.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service("basketService")
public class BasketServiceImpl implements BasketService{

    private final BasketRepository basketRepository;

    @Override
    public void add(Basket basket,Long itemNo, Long userNo) {
        basket = Basket.builder()
                .itemNo(itemNo)
                .userNo(userNo)
                .orderPrice()
                .build();
        basketRepository.save(basket);
    }
}
