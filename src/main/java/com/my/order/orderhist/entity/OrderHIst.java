package com.my.order.orderhist.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class OrderHIst {

    @Id
    @GeneratedValue
    @Column
    private Long histNo;

    @Column
    private Long orderNo;

    @Column
    private Long itemNo;

    @Column
    private String userId;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime orderTime;

    @Builder
    public OrderHIst(Long orderNo, Long itemNo, String userId, LocalDateTime orderTime){
        this.orderNo=orderNo;
        this.itemNo=itemNo;
        this.userId=userId;
        this.orderTime=orderTime;
    }
}
