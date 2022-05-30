package com.my.order.item.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Getter
@NoArgsConstructor
public class ItemEntity {


    @Column
    @GeneratedValue
    private Long itemNo;

    @Column
    private String itemTitle;

    @Column
    private String itemPrice;

    @Column
    private String itemCategory;
}
