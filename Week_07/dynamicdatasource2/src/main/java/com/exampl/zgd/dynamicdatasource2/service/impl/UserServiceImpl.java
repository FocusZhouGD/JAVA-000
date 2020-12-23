package com.exampl.zgd.dynamicdatasource2.service.impl;

import com.exampl.zgd.dynamicdatasource2.datasource.CurDataSource;
import com.exampl.zgd.dynamicdatasource2.entity.User;
import com.exampl.zgd.dynamicdatasource2.mapper.UserMapper;
import com.exampl.zgd.dynamicdatasource2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUser() {
        return userMapper.getAll();
    }

    @CurDataSource
    @Override
    public List<User> getUserSecond() {
        return userMapper.getAll();
    }
}
