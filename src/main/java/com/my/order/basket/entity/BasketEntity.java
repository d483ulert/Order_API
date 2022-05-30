package com.my.order.basket.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Getter
@NoArgsConstructor
public class BasketEntity {


    @Column
    @GeneratedValue
    private Long userNo;

    @Column
    private String itemNo;

    @Column
    private String orderPrice;

}
