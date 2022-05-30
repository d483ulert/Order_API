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
public class UserEntity {

    @Id
    @GeneratedValue
    @Column
    private long userNo;

    @Column
    private String userId;

    @Column
    private String userGrade;

    @Column
    private String userSavedMoney;


    @Builder
    public UserEntity(String userId,String userGrade, String userSavedMoney){
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

