package com.github.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

/**
 * zhangbo
 */
@Doc(value = "用户信息")
public class User {

    @ApiField(value = "姓名")
    public String name;

}
