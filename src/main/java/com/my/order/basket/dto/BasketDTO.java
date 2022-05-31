package com.my.order.basket.dto;

import lombok.Data;

@Data
public class BasketDTO {

    private Long basketNo;

    private String userNo;

    private String itemNo;

    private String orderPrice;

}
