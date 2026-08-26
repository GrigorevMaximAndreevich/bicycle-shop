package com.github.grigorevmaximandreevich.bicycleshop.dto.bike;

import com.github.grigorevmaximandreevich.bicycleshop.entity.BikeCategory;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class BikeResponse {

    private UUID id;

    private String brand;

    private String name;

    private BikeCategory category;

    private BigDecimal price;

    private String size;

    private Integer releaseYear;

    private String description;

    private Integer quantity;
}
