package com.exampl.zgd.dynamicdatasource2.mapper;

import com.exampl.zgd.dynamicdatasource2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> getAll();
}
