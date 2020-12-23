package com.example.sharedingspherereadwrite.service.impl;

import com.example.sharedingspherereadwrite.entity.User;
import com.example.sharedingspherereadwrite.mapper.UserMapper;
import com.example.sharedingspherereadwrite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int saveOne(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> list() {
        return userMapper.selectAll();
    }
}
