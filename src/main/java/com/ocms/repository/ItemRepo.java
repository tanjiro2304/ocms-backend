package com.ocms.repository;

import com.ocms.entities.ItemEntity;
import com.ocms.entities.SubscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Long, ItemEntity> {
}
