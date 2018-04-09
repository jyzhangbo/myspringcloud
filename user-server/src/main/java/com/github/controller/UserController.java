package com.github.controller;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;
import com.github.user.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * zhangbo
 */
@RestController
@RequestMapping(value = "/user")
@Doc(value = "用户接口",group = "接口/用户")
public class UserController {

    @Value("${server.port}")
    public String port;

    @RequestMapping(value = "/query")
    @Doc(value = "获取用户信息")
    public User queryUser(){
        User user=new User();
        user.port=port;
        user.name="zz";
        user.address="北京";
        return user;
    }

}
