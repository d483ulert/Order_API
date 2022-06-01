package com.my.order.order.orderDTO;

import lombok.Data;


import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {

    private Long orderNo;

    private Long userNo;

    private Long itemNo;

    private String priceSum;

    private String address;

    private LocalDateTime orderDate;

    private List<OrderDTO> orderDTOList;

    public List<OrderDTO> getOrderDTO(){
        return orderDTOList;
    }

}
