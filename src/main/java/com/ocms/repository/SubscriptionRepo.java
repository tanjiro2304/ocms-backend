package com.ocms.repository;

import com.ocms.entities.SubscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.JaasPasswordCallbackHandler;

public interface SubscriptionRepo extends JpaRepository<SubscriptionEntity, Long> {
}