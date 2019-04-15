package com.example.demo.service.impl;


import com.example.demo.mapper.UserMapper;

import com.example.demo.service.InterLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;

/**
 * Created by qfcomputer on 2018/5/27.
 */


@Service
public class ImpleLoginService implements InterLoginService {

    @Autowired
    UserMapper userMapper;
    public User loginResult(String name,String passwd){
        return userMapper.findByUsernameAndPassword(name,passwd);
    }
}
