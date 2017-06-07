package com.business.mapper;

import org.apache.ibatis.annotations.*;

import com.business.entity.User;

@Mapper
public interface UserMapper {

    User findByName(String name);
}