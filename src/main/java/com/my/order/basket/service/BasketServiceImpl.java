package com.my.order.basket.service;

import com.my.order.basket.entity.Basket;
import com.my.order.basket.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("basketService")
public class BasketServiceImpl implements BasketService{

    private final BasketRepository basketRepository;

    @Override
    @Transactional
    public List<Basket> List(String userNo) {
        return basketRepository.findAll(Sort.by(Sort.Direction.DESC,"basketNo"));
    }

    @Override
    @Transactional
    public void Add(Long itemNo, Long userNo,String orderPrice) {
        Basket basket =new Basket();
        basket = Basket.builder()
                .itemNo(itemNo)
                .userNo(userNo)
                .orderPrice(orderPrice)
                .build();
        basketRepository.save(basket);
    }

    @Override
    @Transactional
    public long Duplicate(Long itemNo, Long userNo) {
        Basket basket =new Basket();
        Optional<Basket> optionalBasket= basketRepository.findById(itemNo);
        if(optionalBasket.isPresent()){
            basket =optionalBasket.get();
            return basket.getBasketNo();
        }else{
            return 1;
        }
    }

    @Override
    @Transactional
    public void Delete(Long basketNo) {
        basketRepository.deleteById(basketNo);
    }
}
