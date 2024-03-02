package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserSevice {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll()
    {
        return userDao.selectAll();
    }
}
