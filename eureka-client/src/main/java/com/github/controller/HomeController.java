package com.github.controller;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;
import com.github.controller.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * zhangbo
 */
@RestController
@RequestMapping(value = "/home")
@Doc(value = "测试",group = "接口/home")
public class HomeController {

    @RequestMapping(value = "/getName")
    @Doc(value = "获取姓名")
    public User home(@RequestParam @ApiField(value = "姓名") String name){
        return null;
    }

}
