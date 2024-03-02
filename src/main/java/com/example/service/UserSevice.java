package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserSevice {
    List<User> selectAll();
}
