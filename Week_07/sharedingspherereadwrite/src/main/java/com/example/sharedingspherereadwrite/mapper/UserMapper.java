package com.example.sharedingspherereadwrite.mapper;

import com.example.sharedingspherereadwrite.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectAll();

    int insert(User user);
}
