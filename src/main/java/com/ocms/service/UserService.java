package com.ocms.service;

import com.ocms.entities.UserEntity;

public interface UserService {
    UserEntity getUserByUserName(String username);
}