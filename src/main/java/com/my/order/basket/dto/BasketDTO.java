package com.my.order.basket.dto;

import lombok.Data;

@Data
public class BasketDTO {

    private Long basketNo;

    private Long userNo;

    private Long itemNo;

    private String orderPrice;

}
