package com.github.grigorevmaximandreevich.bicycleshop.dto.cart;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class CartItemResponse {

    private UUID id;
    private UUID bikeId;
    private String brand;
    private String bikeName;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal totalPrice;
}
