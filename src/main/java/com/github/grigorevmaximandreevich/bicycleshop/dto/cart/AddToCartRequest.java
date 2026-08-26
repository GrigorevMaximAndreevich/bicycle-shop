package com.github.grigorevmaximandreevich.bicycleshop.dto.cart;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class AddToCartRequest {

    @NotNull
    private UUID bikeId;

    @NotNull
    @Min(1)
    private Integer quantity;
}
