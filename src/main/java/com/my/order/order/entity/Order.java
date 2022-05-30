package com.my.order.order.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class Order {

    @Column
    @GeneratedValue
    private Long orderNo;

    @Column
    private String userNo;

    @Column
    private String itemNo;

    @Column
    private String priceSum;

    @Column
    private String address;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime orderDate;


    @Builder
    public Order(String userNo, String itemNo, String priceSum, String address,LocalDateTime orderDate){
        this.userNo=userNo;
        this.itemNo=itemNo;
        this.priceSum=priceSum;
        this.address=address;
        this.orderDate=orderDate;
    }

    public void UpdateAddress(String address){
        this.address=address;
    }
}
