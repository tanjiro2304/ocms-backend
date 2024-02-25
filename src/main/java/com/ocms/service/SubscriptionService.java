package com.ocms.service;

import com.ocms.dto.SubscriptionDto;
import com.ocms.entities.SubscriptionEntity;

import java.util.List;

public interface SubscriptionService {
    SubscriptionEntity save(SubscriptionEntity item);

    List<SubscriptionDto> fetchAll();

    SubscriptionEntity findById(Long id);
}