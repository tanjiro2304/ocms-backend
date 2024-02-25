package com.ocms.serviceimpl;

import com.ocms.dto.OrderDto;
import com.ocms.entities.ItemEntity;
import com.ocms.entities.OrderEntity;
import com.ocms.repository.OrderRepo;
import com.ocms.service.OrderService;
import com.ocms.utils.ModelMapperObject;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.stream.Stream;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderRepo orderRepo;
    @Override
    public OrderEntity save(OrderDto dto) {
        OrderEntity entity = ModelMapperObject.getInstance().map(dto, OrderEntity.class);
        return orderRepo.save(entity);
    }
}