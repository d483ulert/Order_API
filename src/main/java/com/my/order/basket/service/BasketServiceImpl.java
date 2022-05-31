package com.my.order.basket.service;

import com.my.order.basket.entity.Basket;
import com.my.order.basket.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service("basketService")
public class BasketServiceImpl implements BasketService{

    private final BasketRepository basketRepository;

    @Override
    public void add(String itemNo, String userNo,String orderPrice) {
        Basket basket =new Basket();
        basket = Basket.builder()
                .itemNo(itemNo)
                .userNo(userNo)
                .orderPrice(orderPrice)
                .build();
        basketRepository.save(basket);
    }

    @Override
    public long duplicate(String itemNo, String userNo) {
        Basket basket =new Basket();
        Optional<Basket> optionalBasket= basketRepository.findById(itemNo,userNo);
        if(optionalBasket.isPresent()){
            basket =optionalBasket.get();
            return basket.getBasketNo();
        }else{
            return 1;
        }
    }
}
