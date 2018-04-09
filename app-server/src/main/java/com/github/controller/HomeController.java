package com.github.controller;

import cn.mapway.document.annotation.ApiField;
import com.github.client.HomeClient;
import com.github.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

/**
 * zhangbo
 */
@RestController
@RequestMapping("/app")
public class HomeController {

    @Autowired
    HomeClient homeClient;

    @RequestMapping(value = "/getUser")
    public User getUserInfo(){
        User user = homeClient.queryUser();
        return user;
    }

    @RequestMapping(value = "/user")
    public User getUser(){
        User user=new User();
        user.address="aaa";
        user.name="bbb";
        return user;
    }

}
