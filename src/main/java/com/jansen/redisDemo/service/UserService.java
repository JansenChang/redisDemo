package com.jansen.redisDemo.service;

import com.jansen.redisDemo.dto.User;

import java.util.List;

public interface UserService {

    User findUserById(Integer uid);
}
