package com.pslearning.boot.component;

import com.pslearning.boot.dao.UserDao;
import com.pslearning.boot.data.repository.UserRepository;
import com.pslearning.boot.entity.User;
import com.pslearning.boot.projection.UserProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class TestingComponent {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Set<UserDao> getAllUserDaos() {
        return userRepository.findAllUserDaos();
    }

    public Set<UserProjection> getAllUserProjections() {
        return userRepository.findAllUserProjections();
    }
}
