package com.github.grigorevmaximandreevich.bicycleshop.repository;

import com.github.grigorevmaximandreevich.bicycleshop.entity.Bike;
import com.github.grigorevmaximandreevich.bicycleshop.entity.BikeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface BikeRepository extends JpaRepository<Bike, UUID> {

    List<Bike> findByCategory(BikeCategory category);
    List<Bike> findByBrand(String brand);
    List<Bike> findByCategoryAndBrand(BikeCategory category, String brand);
    List<Bike> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
    List<Bike> findByCategoryAndPriceBetween(BikeCategory category, BigDecimal minPrice, BigDecimal maxPrice);
    List<Bike> findByBrandAndPriceBetween(String brand, BigDecimal minPrice, BigDecimal maxPrice);
    List<Bike> findByCategoryAndBrandAndPriceBetween(
            BikeCategory category, String brand, BigDecimal minPrice, BigDecimal maxPrice);

}
