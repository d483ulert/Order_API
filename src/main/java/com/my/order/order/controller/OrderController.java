package com.my.order.order.controller;

import com.my.order.item.dto.ItemDTO;
import com.my.order.item.entity.Item;
import com.my.order.item.repository.ItemRepository;
import com.my.order.order.orderDTO.OrderDTO;
import com.my.order.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    private final ItemRepository itemRepository;

    @PostMapping("buy")
    public void orderBuy(@RequestBody OrderDTO orderDTO) {
        ItemDTO iTemDTO =new ItemDTO();

        for(int i=0; i<iTemDTO.getItemList().size(); i++){
            Item item = itemRepository.getById(iTemDTO.getItemList().get(i).getItemNo());
            item.SellStock(item.getItemStock());
        }

        orderService.add(orderDTO);
    }

    @PostMapping("cancle")
    public void orderCancle(@RequestBody OrderDTO orderDTO){
        orderService.delete(orderDTO);
    }
}
