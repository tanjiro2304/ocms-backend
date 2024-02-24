package com.ocms.service;

import com.ocms.entities.ItemEntity;

import java.util.List;

public interface ItemService {
    ItemEntity save(ItemEntity item);

    List<ItemEntity> findAll();
}
