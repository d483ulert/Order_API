package com.my.order.user.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column
    private long userNo;

    @Column //회원ID
    private String userId;

    @Column //회원등급
    private String userGrade;

    @Column //회원 적립금
    private String userSavedMoney;


    @Builder
    public User(String userId, String userGrade, String userSavedMoney){
        this.userId=userId;
        this.userGrade=userGrade;
        this.userSavedMoney=userSavedMoney;
    }

    public void savedMoney(String userSavedMoney){
        this.userSavedMoney=userSavedMoney;
    }

    public void userGradeUP(String userGrade){
        if(userGrade.equals("브론즈")){
            userGrade="실버";
        }else if(userGrade.equals("실버")){
            userGrade="골드";
        }
    }
}

