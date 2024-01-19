package com.surendra.order.entity;

import com.surendra.order.dto.FoodItemsDTO;
import com.surendra.order.dto.RestaurentDTO;
import com.surendra.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//To make this class as a document(for mongodb) we need @Document (like @Entity)
@Document("order")
public class OrderEntity {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private RestaurentDTO restaurent;
    private UserDTO user;
}
