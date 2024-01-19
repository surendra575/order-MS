package com.surendra.order.mapper;

import com.surendra.order.dto.OrderDTO;
import com.surendra.order.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE= Mappers.getMapper(OrderMapper.class);
    OrderEntity mapOrderDTOToOrderEntity(OrderDTO orderDTO);
    OrderDTO mapOrderEntityToOrderDTO(OrderEntity orderEntity);
}
