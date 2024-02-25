package com.ocms.controller;

import com.ocms.dto.OrderDto;
import com.ocms.entities.ItemEntity;
import com.ocms.entities.OrderEntity;
import com.ocms.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/order",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private OrderService orderService;
    @PostMapping("/add")
    public ResponseEntity<OrderEntity> addItem(@RequestBody @Valid OrderDto item) {
        OrderEntity entity = orderService.save(item);
        return ResponseEntity.ok(entity);
    }
}