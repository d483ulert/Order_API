package com.my.order.basket.entity;

import com.my.order.item.entity.Item;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Basket {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long basketNo;

    @Column
    private Long userNo;

    @Column
    private Long itemNo;

    @Column
    private String orderPrice;

    @Builder
    public Basket(Long userNo, Long itemNo, String orderPrice){
        this.userNo=userNo;
        this.itemNo=itemNo;
        this.orderPrice=orderPrice;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="itemNo")
    private List<Item> items ;

}
