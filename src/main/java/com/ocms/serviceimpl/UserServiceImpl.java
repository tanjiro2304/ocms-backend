package com.ocms.serviceimpl;

import com.ocms.entities.UserEntity;
import com.ocms.repository.UserRepo;
import com.ocms.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepo userRepo;

    @Override
    public UserEntity getUserByUserName(String username) {
        return userRepo.findByUsername(username);
    }
}