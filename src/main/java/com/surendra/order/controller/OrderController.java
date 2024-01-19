package com.surendra.order.controller;

import com.surendra.order.dto.OrderDTO;
import com.surendra.order.dto.OrderDTOFromUI;
import com.surendra.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    public OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromUI orderDetails){
        System.out.println("Quantity from UI is: "+orderDetails);

        OrderDTO orderSavedInDB=orderService.saveOrder(orderDetails);
        return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);
    }
}
