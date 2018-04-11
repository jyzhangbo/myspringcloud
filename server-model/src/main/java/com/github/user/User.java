package com.github.user;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

import java.util.List;

/**
 * zhangbo
 */
@Doc(value = "用户信息")
public class User {

    @ApiField(value = "端口",example = "1234")
    public String port;


    @ApiField(value = "姓名",example = "张博")
    public String name;

    @ApiField(value = "地址",example = "北京")
    public String address;


}
