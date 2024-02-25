package com.ocms.service;

import com.ocms.dto.OrderDto;
import com.ocms.entities.OrderEntity;

public interface OrderService {

    OrderEntity save(OrderDto dto);
}