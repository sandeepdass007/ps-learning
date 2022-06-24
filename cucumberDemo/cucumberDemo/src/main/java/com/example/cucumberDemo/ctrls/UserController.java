package com.example.cucumberDemo.ctrls;

import com.example.cucumberDemo.entity.UserEntity;
import com.example.cucumberDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/userData")
    public Optional<UserEntity> getUser(Long id) {
        return  userService.getUserById(id);

    }
}
