package com.github.grigorevmaximandreevich.bicycleshop.dto.cart;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class CartResponse {

    private UUID id;
    private List<CartItemResponse> items;
    private BigDecimal totalPrice;

}
