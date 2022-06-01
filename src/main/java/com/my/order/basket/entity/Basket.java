package com.my.order.basket.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter
@NoArgsConstructor
public class Basket {


    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long basketNo;

    @Column
    private Long userNo;

    @Column
    private Long itemNo;

    @Column
    private String orderPrice;


    @Builder
    public Basket(Long userNo, Long itemNo, String orderPrice){
        this.userNo=userNo;
        this.itemNo=itemNo;
        this.orderPrice=orderPrice;
    }

}
