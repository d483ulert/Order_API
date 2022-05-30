package com.my.order.basket.repository;

import com.my.order.basket.entity.BasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<BasketEntity,Long> {
}
