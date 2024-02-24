package com.ocms.controller;

import com.ocms.entities.ItemEntity;
import com.ocms.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/item",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class ItemController {

    @Autowired
    ItemService itemService;
    @PostMapping("/add")
    public ResponseEntity<ItemEntity> addItem(@RequestBody @Valid ItemEntity item) {
        ItemEntity newItem = itemService.save(item);

        return ResponseEntity.ok(item);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<ItemEntity>> fetchAll() {
        return ResponseEntity.ok(itemService.findAll());
    }

}
