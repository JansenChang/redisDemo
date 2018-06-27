package com.jansen.redisDemo.service.impl;

import com.jansen.redisDemo.dao.UserMapper;
import com.jansen.redisDemo.dto.User;
import com.jansen.redisDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findUserById(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
