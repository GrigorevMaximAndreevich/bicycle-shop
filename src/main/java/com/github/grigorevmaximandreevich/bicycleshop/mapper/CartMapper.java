package com.github.grigorevmaximandreevich.bicycleshop.mapper;

import com.github.grigorevmaximandreevich.bicycleshop.dto.cart.CartItemResponse;
import com.github.grigorevmaximandreevich.bicycleshop.dto.cart.CartResponse;
import com.github.grigorevmaximandreevich.bicycleshop.entity.Cart;
import com.github.grigorevmaximandreevich.bicycleshop.entity.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {

    @Mapping(source = "cartItems", target = "items")
    CartResponse toResponse(Cart cart);

    @Mapping(source = "bike.id", target = "bikeId")
    @Mapping(source = "bike.brand", target = "brand")
    @Mapping(source = "bike.name", target = "bikeName")
    @Mapping(source = "bike.price", target = "price")
    CartItemResponse toItemResponse(CartItem cartItem);
}
