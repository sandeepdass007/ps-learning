package com.example.cucumberDemo.service;

import com.example.cucumberDemo.entity.UserEntity;
import com.example.cucumberDemo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void register(UserEntity userEntity) throws RuntimeException {
        userRepository.save(userEntity);
    }


    @Override
    public Optional<UserEntity> getUserById(Long id) {

        final Optional<UserEntity> usedIds = userRepository.findById(id);
        return usedIds;
    }


    public List<UserEntity> getAllUserByIds(List<Long> ids) {

        final List<UserEntity> allById = userRepository.findAllById(ids);
        return allById;
    }




}
