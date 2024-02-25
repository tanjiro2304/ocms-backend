package com.ocms.serviceimpl;

import com.ocms.dto.ItemDto;
import com.ocms.entities.ItemEntity;
import com.ocms.repository.ItemRepo;
import com.ocms.service.ItemService;
import com.ocms.utils.ModelMapperObject;
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
    public List<ItemDto> findAll() {
        return itemRepo.findAll().stream().map(itemEntity ->
                ModelMapperObject.getInstance().map(itemEntity, ItemDto.class)).toList();
    }

    public void changeQuantity(Long itemId){
        itemRepo.findById(itemId).ifPresent(entity -> {
            entity.setItemQuantity(entity.getItemQuantity() - 1);
            itemRepo.save(entity);
        });
    }
}