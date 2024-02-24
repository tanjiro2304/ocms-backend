package com.ocms.serviceimpl;

import com.ocms.entities.ItemEntity;
import com.ocms.repository.ItemRepo;
import com.ocms.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepo itemRepo;
    @Override
    public ItemEntity save(ItemEntity item) {
        return itemRepo.save(item);
    }

    @Override
    public List<ItemEntity> findAll() {
        return itemRepo.findAll();
    }
}
