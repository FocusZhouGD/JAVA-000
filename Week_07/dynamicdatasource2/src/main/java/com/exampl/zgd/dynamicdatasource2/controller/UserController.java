package com.exampl.zgd.dynamicdatasource2.controller;

import com.exampl.zgd.dynamicdatasource2.entity.User;
import com.exampl.zgd.dynamicdatasource2.service.UserService;
import com.exampl.zgd.dynamicdatasource2.service.impl.UserServiceImpl;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        List<User> user = userService.getUser();
        return user.toString();
    }

    @GetMapping("/getUserSecond")
    public String getUserSecond(){
        List<User> user= userService.getUserSecond();
        return user.toString();
    }
}
