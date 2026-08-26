package com.github.grigorevmaximandreevich.bicycleshop.mapper;

import com.github.grigorevmaximandreevich.bicycleshop.dto.bike.BikeResponse;
import com.github.grigorevmaximandreevich.bicycleshop.dto.bike.CreateBikeRequest;
import com.github.grigorevmaximandreevich.bicycleshop.dto.bike.UpdateBikeRequest;
import com.github.grigorevmaximandreevich.bicycleshop.entity.Bike;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BikeMapper {

    BikeResponse toResponse(Bike bike);

    Bike toEntity(CreateBikeRequest request);

    void updateEntity(UpdateBikeRequest request, @MappingTarget Bike bike);
}
