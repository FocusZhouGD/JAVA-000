package com.example.zgd.datasource.dao;

import com.example.zgd.datasource.dao.mapper.UserMapper;
import com.example.zgd.datasource.dynamic.DBSource;
import com.example.zgd.datasource.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
//
//    private final UserMapper userMapper;
//    @Autowired(required = false)
//    public UserDao(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }
    @Autowired
    private UserMapper userMapper;

    @DBSource("db-read")
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @DBSource("db-master")
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

}
