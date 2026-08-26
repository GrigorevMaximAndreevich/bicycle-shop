package com.github.grigorevmaximandreevich.bicycleshop.dto.order;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class OrderItemResponse {

    private UUID bikeId;
    private String brand;
    private String bikeName;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal totalPrice;
}
