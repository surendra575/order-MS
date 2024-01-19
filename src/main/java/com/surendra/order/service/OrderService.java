package com.surendra.order.service;

import com.surendra.order.dto.OrderDTO;
import com.surendra.order.dto.OrderDTOFromUI;
import com.surendra.order.dto.UserDTO;
import com.surendra.order.entity.OrderEntity;
import com.surendra.order.mapper.OrderMapper;
import com.surendra.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    public OrderRepo repo;

    @Autowired
    public SequenceGenerator sequenceGeneratorzz;

    @Autowired
    public RestTemplate restTemplate;

    public OrderDTO saveOrder(OrderDTOFromUI orderDetails) {

        //Here in the OrderDTOFromUI will have only the userID, we should get other details from 'UserMS' using that userId
        UserDTO user=fetchUserDetailsFromUserId(orderDetails.getUserId());

        int newOrderId = sequenceGeneratorzz.generateNxtOrder();
        OrderEntity orderToBeSaved=new OrderEntity(newOrderId,orderDetails.getFoodItemsList(),orderDetails.getRestaurent(),user);
        repo.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapOrderEntityToOrderDTO(orderToBeSaved);
    }

    private UserDTO fetchUserDetailsFromUserId(Integer userId) {
        return restTemplate.getForObject("http://USER-SERVICE/user/fetchUserById/" + userId, UserDTO.class);
    }
}
