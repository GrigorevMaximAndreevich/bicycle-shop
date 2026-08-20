package com.github.grigorevmaximandreevich.bicycleshop.repository;

import com.github.grigorevmaximandreevich.bicycleshop.entity.Order;
import com.github.grigorevmaximandreevich.bicycleshop.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {

    List<Order> findByUserId(UUID userId);
    List<Order> findByUserIdAndStatus(UUID userId, OrderStatus status);
}
