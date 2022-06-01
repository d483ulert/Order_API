package com.my.order.item.dto;
import java.util.List;
import lombok.Data;

@Data
public class ItemDTO {

    private Long itemNo;

    private String itemTitle;

    private String itemPrice;

    private String itemCategory;

    private int ItemStock;

    public List<ItemDTO> ItemList;

    public List<ItemDTO> getItemList(){
        return ItemList;
    }
}
