package com.ocms.controller;

import com.ocms.config.UserAuthenticationProvider;
import com.ocms.entities.UserEntity;
import com.ocms.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/register",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserAuthenticationProvider userAuthenticationProvider;

    @PostMapping("/login")
    public ResponseEntity<UserEntity> login(@RequestBody @Valid UserEntity userEntity) {
        UserEntity user = userService.login(userEntity);
        user.setToken(userAuthenticationProvider.createToken(userEntity.getUsername()));
        return ResponseEntity.ok(user);
    }

    @PostMapping("/signup")
    public ResponseEntity<UserEntity> signUp(@RequestBody @Valid UserEntity userEntity) {
        UserEntity user = userService.save(userEntity);
        user.setToken(userAuthenticationProvider.createToken(userEntity.getUsername()));
        return ResponseEntity.ok(user);
    }
}