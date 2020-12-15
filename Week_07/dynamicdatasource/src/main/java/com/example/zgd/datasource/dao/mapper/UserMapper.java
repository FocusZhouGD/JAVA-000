package com.example.zgd.datasource.dao.mapper;


import com.example.zgd.datasource.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getAll();

    User getUserById(@Param("id")int id);
}
