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

    @Column
    private int ItemStock;

    @Builder
    public Item(String itemTitle, String itemPrice, String itemCategory){
        this.itemTitle=itemTitle;
        this.itemPrice=itemPrice;
        this.itemCategory=itemCategory;
    }

    //상품 제목수정
    public void UpdateTitle(String itemTitle){
        this.itemTitle=itemTitle;
    }

    //상품 가격수정
    public void UpdatePrice(String itemPrice){
        this.itemPrice=itemPrice;
    }

    //구매 후 재고수정
    public void SellStock(Long ItemStock){
        this.ItemStock --;
    }

    //구매 취소 후 재고수정
    public void CancleStock(int ItemStock,int cnt){
        this.ItemStock = ItemStock-cnt;
    }

}
