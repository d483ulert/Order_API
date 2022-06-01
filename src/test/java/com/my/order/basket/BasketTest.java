package com.my.order.basket;


import com.my.order.basket.entity.Basket;
import com.my.order.basket.repository.BasketRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class BasketTest {

    @Autowired
    private BasketRepository basketRepository;

    @Test
    public void List(){
        Basket basket =new Basket();

        Optional<Basket> optionalBasket= basketRepository.findById(1L,1L);
        basket =optionalBasket.get();
        System.out.println(basket);
    }
}
