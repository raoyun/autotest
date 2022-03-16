package com.raoyun.service;

import com.raoyun.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int insert(User user);
}
