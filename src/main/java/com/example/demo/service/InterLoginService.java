package com.example.demo.service;

import com.example.demo.model.User;

/**
 * Created by qfcomputer on 2018/5/27.
 */


public interface InterLoginService {
    public User loginResult(String name, String passwd);
}
