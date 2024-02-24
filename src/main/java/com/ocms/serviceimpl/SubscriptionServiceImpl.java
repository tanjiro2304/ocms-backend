package com.ocms.serviceimpl;

import com.ocms.entities.SubscriptionEntity;
import com.ocms.repository.SubscriptionRepo;
import com.ocms.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionRepo repo;
    @Override
    public SubscriptionEntity save(SubscriptionEntity item) {
        return repo.save(item);
    }
}
