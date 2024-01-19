package com.surendra.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/*This DTO is to map the UI fields*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDTOFromUI {
    private List<FoodItemsDTO> foodItemsList;
    private Integer userId;
    private RestaurentDTO restaurent;

}
