package com.my.order.orderhist.service;

import com.my.order.orderhist.entity.OrderHIst;
import com.my.order.orderhist.repository.OrderHistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service("orderHistServiceImpl")
public class OrderHistServiceImpl implements OrderHistService{

    private final OrderHistRepository orderHistRepository;

    @Override
    public void add(OrderHIst orderHIst,Long orderNo, Long itemNo, Long userNo, String userId) {
        orderHIst = OrderHIst.builder()
                .orderNo(orderNo)
                .itemNo(itemNo)
                .userId(userId)
                .orderTime(LocalDateTime.now())
                .build();
        orderHistRepository.save(orderHIst);
    }
}
