package com.ocms.repository;

import com.ocms.entities.AccountEntity;
import com.ocms.entities.SubscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<AccountEntity, Long> {
}