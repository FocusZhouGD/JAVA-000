package com.example.zgd.datasource.dao.mapper;


import com.example.zgd.datasource.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();

    User getUserById(@Param("id")int id);
}
