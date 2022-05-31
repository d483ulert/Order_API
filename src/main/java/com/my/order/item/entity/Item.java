package com.my.order.item.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Getter
@NoArgsConstructor
public class Item {


    @Column
    @GeneratedValue
    private Long itemNo;

    @Column
    private String itemTitle;

    @Column
    private String itemPrice;

    @Column
    private String itemCategory;

    @Builder
    public Item(String itemTitle, String itemPrice, String itemCategory){
        this.itemTitle=itemTitle;
        this.itemPrice=itemPrice;
        this.itemCategory=itemCategory;
    }

    public void UpdateTitle(String itemTitle){
        this.itemTitle=itemTitle;
    }

    public void UpdatePrice(String itemPrice){
        this.itemPrice=itemPrice;
    }

}
