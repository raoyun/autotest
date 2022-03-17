package com.raoyun.controller;

import com.raoyun.entity.User;
import com.raoyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public int save(@RequestBody User user){
        return userService.insert(user);
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}
