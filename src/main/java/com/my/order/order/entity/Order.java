package com.my.order.order.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class Order {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNo;

    @Column
    private Long userNo;

    @Column
    private Long itemNo;

    @Column
    private String priceSum;

    @Column
    private String address;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime orderDate;


    @Builder
    public Order(Long userNo, Long itemNo, String priceSum, String address,LocalDateTime orderDate){
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
