package com.ocms.serviceimpl;

import com.ocms.dto.SubscriptionDto;
import com.ocms.entities.SubscriptionEntity;
import com.ocms.repository.SubscriptionRepo;
import com.ocms.service.SubscriptionService;
import com.ocms.utils.ModelMapperObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionRepo repo;
    @Override
    public SubscriptionEntity save(SubscriptionEntity item) {
        return repo.save(item);
    }

    @Override
    public List<SubscriptionDto> fetchAll() {
        return repo.findAll().stream().map(entity ->
                ModelMapperObject.getInstance().map(entity, SubscriptionDto.class)).toList();
    }

    @Override
    public SubscriptionEntity findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}