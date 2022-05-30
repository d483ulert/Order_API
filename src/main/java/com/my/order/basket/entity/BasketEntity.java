package com.my.order.basket.entity;

import lombok.Builder;
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
    private Long basketNo;

    @Column
    private String userNo;

    @Column
    private String itemNo;

    @Column
    private String orderPrice;


    @Builder
    public BasketEntity(String userNo, String itemNo,String orderPrice){
        this.userNo=userNo;
        this.itemNo=itemNo;
        this.orderPrice=orderPrice;
    }

}
