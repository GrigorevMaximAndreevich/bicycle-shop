package com.github.grigorevmaximandreevich.bicycleshop.dto.bike;

import com.github.grigorevmaximandreevich.bicycleshop.entity.BikeCategory;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CreateBikeRequest {

    @NotBlank
    private String brand;

    @NotBlank
    private String name;

    @NotNull
    private BikeCategory category;

    @NotNull
    @DecimalMin(value = "0.00")
    private BigDecimal price;

    @NotBlank
    private String size;

    @NotNull
    @Min(2000)
    private Integer releaseYear;

    @NotBlank
    private String description;

    @NotNull
    @Min(0)
    private Integer quantity;
}
