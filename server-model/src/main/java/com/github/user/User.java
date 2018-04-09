package com.github.user;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

/**
 * zhangbo
 */
@Doc(value = "用户信息")
public class User {


    @ApiField(value = "姓名",example = "张博")
    public String name;

    @ApiField(value = "地址",example = "北京")
    public String address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
