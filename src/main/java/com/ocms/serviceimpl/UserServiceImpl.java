package com.ocms.serviceimpl;

import com.ocms.entities.UserEntity;
import com.ocms.exception.AppException;
import com.ocms.repository.UserRepo;
import com.ocms.service.UserService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepo userRepo;


    private final PasswordEncoder passwordEncoder;

    @Override
    public UserEntity loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }

    @Override
    public UserEntity save(UserEntity user) {
        return userRepo.save(user);
    }

    public UserEntity saveUser(UserEntity entity){

        entity.setPassword(passwordEncoder.encode(CharBuffer.wrap(entity.getPassword())));
        entity = userRepo.save(entity);
        return entity;
    }

    public UserEntity findById(Long id){
        return userRepo.findById(id).orElse(null);
    }


    public UserEntity login(UserEntity userEntity) {
        UserEntity user = userRepo.findByUsername(userEntity.getUsername());

        if (passwordEncoder.matches(userEntity.getPassword(), user.getPassword())) {
            return user;
        }
        throw new AppException("Invalid password", HttpStatus.BAD_REQUEST);
    }
}