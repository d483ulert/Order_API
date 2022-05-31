package com.my.order.basket.repository;

import com.my.order.basket.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket,Long> {

    @Query("" +
            "")
    public List<Object[]> listUserBasket(Long basketNo);

}
