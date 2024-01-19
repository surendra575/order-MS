package com.surendra.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodItemsDTO {
    public Integer id;
    public String itemName;
    private String itemDescription;
    public boolean isVeg;
    public Number price;
    public Integer restaurentId;
    public Integer Quantity;
}

