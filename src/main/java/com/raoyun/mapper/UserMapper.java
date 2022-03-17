package com.raoyun.mapper;

import com.raoyun.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    public int insert(User user);
    public List<User> findAll();
}
