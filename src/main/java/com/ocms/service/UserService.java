package com.ocms.service;

import com.ocms.entities.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserEntity loadUserByUsername(String username);
}