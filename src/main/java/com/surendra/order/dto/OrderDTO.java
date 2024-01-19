package com.surendra.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDTO {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private RestaurentDTO restaurent;
    private UserDTO user;

}
