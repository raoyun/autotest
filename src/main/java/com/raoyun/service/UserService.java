package com.raoyun.service;

import com.raoyun.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    public int insert(User user);
    public List<User> findAll();
}
