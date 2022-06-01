package com.my.order.orderhist.repository;

import com.my.order.orderhist.entity.OrderHIst;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHistRepository extends JpaRepository<OrderHIst,Long> {
}
