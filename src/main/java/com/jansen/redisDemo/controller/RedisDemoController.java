package com.jansen.redisDemo.controller;

import com.jansen.redisDemo.dto.User;
import com.jansen.redisDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/redisDemo")
public class RedisDemoController {

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public User test(){
        User user = userService.findUserById(1000);
        System.out.println(123);
        return user;
    }
}
