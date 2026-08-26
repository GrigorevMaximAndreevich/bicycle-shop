package com.github.grigorevmaximandreevich.bicycleshop.mapper;

import com.github.grigorevmaximandreevich.bicycleshop.dto.order.OrderItemResponse;
import com.github.grigorevmaximandreevich.bicycleshop.dto.order.OrderResponse;
import com.github.grigorevmaximandreevich.bicycleshop.entity.Order;
import com.github.grigorevmaximandreevich.bicycleshop.entity.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(source = "orderItems", target = "items")
    OrderResponse toResponse(Order order);

    @Mapping(source = "bike.id", target = "bikeId")
    @Mapping(source = "bike.brand", target = "brand")
    @Mapping(source = "bike.name", target = "bikeName")
    OrderItemResponse toItemResponse(OrderItem orderItem);
}
