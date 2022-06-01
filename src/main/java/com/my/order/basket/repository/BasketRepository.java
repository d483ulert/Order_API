package com.my.order.basket.repository;

import com.my.order.basket.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BasketRepository extends JpaRepository<Basket,Long> {

    Optional<Basket> findById(Long itemNo, Long userNo);
}
