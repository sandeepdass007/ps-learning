package com.example.cucumberDemo.service;

import com.example.cucumberDemo.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {


    public Optional<UserEntity> getUserById(Long id);

    public List<UserEntity> getAllUserByIds(List<Long> ids);

    void register(UserEntity user) throws RuntimeException;


}
