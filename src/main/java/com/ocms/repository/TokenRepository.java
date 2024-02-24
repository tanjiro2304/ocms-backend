package com.ocms.repository;

import com.ocms.entities.Token;
import com.ocms.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);

    List<Token> findAllTokensByUser(Long id);


}