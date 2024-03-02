package com.example.controller;

import com.example.entity.User;
import com.example.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserSevice userSevice;
    @RequestMapping("/selectAll")
    public List<User> selectAll()
    {
        List<User> users=userSevice.selectAll();
        return users;
    }
}
