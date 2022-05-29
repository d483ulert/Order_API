package com.my.order.user.entity;

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

}

