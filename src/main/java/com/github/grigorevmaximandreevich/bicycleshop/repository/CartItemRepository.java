package com.github.grigorevmaximandreevich.bicycleshop.repository;

import com.github.grigorevmaximandreevich.bicycleshop.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CartItemRepository extends JpaRepository<CartItem, UUID> {

    List<CartItem> findByCartId(UUID cartId);
    Optional<CartItem> findByCartIdAndBikeId(UUID cartId, UUID bikeId);
}
