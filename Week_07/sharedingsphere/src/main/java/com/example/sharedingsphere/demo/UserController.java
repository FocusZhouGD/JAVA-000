package com.example.sharedingsphere.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUser")
    public String getUser(){
        List<User> user = userMapper.getAll();
        return user.toString();
    }

    @GetMapping("/getUserSecond")
    public String getUserSecond(){
        List<User> user= userMapper.getAll();
        return user.toString();
    }
}
