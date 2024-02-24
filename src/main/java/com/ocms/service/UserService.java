package com.ocms.service;

import com.ocms.entities.UserEntity;

public interface UserService {
    UserEntity login(UserEntity userEntity);

    UserEntity loadUserByUsername(String username);

    UserEntity save(UserEntity user);
}