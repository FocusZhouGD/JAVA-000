package com.example.zgd.datasource.web;


import com.example.zgd.datasource.dao.UserDao;
import com.example.zgd.datasource.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("/getUsers")
	public List<User> getUsers() {
        return userDao.getAll();
	}
}