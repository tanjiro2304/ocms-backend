package com.ocms.controller;

import com.ocms.dto.SaveSubscriptionDto;
import com.ocms.dto.SubscriptionDto;
import com.ocms.entities.SubscriptionEntity;
import com.ocms.entities.UserEntity;
import com.ocms.service.SubscriptionService;
import com.ocms.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/subscriptionPlan",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class SubscriptionController {

    @Autowired
    private SubscriptionService service;

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<SubscriptionEntity> addItem(@RequestBody @Valid SubscriptionEntity item) {
        SubscriptionEntity newItem = service.save(item);

        return ResponseEntity.ok(item);
    }

    @PostMapping("/fetchAll")
    public ResponseEntity<List<SubscriptionDto>> fetchAll() {
        return ResponseEntity.ok(service.fetchAll());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody @Valid SaveSubscriptionDto saveSubscriptionDto) {
        UserEntity user= userService.findById(saveSubscriptionDto.getUserId());
        SubscriptionEntity subscription = service.findById(saveSubscriptionDto.getSubscriptionId());
        List<SubscriptionEntity> subscriptionEntities =
                user.getAccount().getSubscriptionEntities() == null ?
                        new ArrayList<>(): user.getAccount().getSubscriptionEntities();
        subscriptionEntities.add(subscription);

        user.getAccount().setSubscriptionEntities(subscriptionEntities);
        userService.save(user);
        return new ResponseEntity(HttpStatus.OK);
    }
}