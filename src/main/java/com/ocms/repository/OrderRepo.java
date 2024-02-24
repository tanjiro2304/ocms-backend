package com.ocms.repository;

import com.ocms.entities.OrderEntity;
import com.ocms.entities.SubscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity, Long> {
}