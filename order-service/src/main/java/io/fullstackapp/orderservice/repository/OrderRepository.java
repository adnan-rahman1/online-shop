package io.fullstackapp.orderservice.repository;

import io.fullstackapp.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
