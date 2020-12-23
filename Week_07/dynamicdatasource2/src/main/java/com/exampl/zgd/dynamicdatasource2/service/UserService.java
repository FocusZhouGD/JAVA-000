package com.exampl.zgd.dynamicdatasource2.service;

import com.exampl.zgd.dynamicdatasource2.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUser();

    List<User> getUserSecond();
}
