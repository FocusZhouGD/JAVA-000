package com.example.sharedingspherereadwrite.service;

import com.example.sharedingspherereadwrite.entity.User;

import java.util.List;

public interface UserService {

    int saveOne(User user);

    List<User> list();
}
