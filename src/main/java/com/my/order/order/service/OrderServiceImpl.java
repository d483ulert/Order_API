package com.my.order.order.service;

import com.my.order.item.repository.ItemRepository;
import com.my.order.order.repository.OrderRepository;
import com.my.order.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service("orderService")
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    private final UserRepository userRepository;

    private final ItemRepository itemRepository;


}
