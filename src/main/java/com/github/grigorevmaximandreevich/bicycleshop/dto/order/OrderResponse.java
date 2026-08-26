package com.github.grigorevmaximandreevich.bicycleshop.dto.order;

import com.github.grigorevmaximandreevich.bicycleshop.entity.OrderStatus;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class OrderResponse {

    private UUID id;
    private OrderStatus status;
    private BigDecimal totalPrice;
    private List<OrderItemResponse> items;
    private Instant createdAt;
}
