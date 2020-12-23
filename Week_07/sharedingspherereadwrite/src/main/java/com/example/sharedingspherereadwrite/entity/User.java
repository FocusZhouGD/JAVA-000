package com.example.sharedingspherereadwrite.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;

    public User(String name) {
        this.name = name;
    }
}
