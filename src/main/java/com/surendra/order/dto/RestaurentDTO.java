package com.surendra.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestaurentDTO {
    private Integer id;
    private String name;
    private String address;
    private String city;
    private String restaurentDescription;
}
