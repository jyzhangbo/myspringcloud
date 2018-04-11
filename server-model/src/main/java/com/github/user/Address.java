package com.github.user;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

/**
 * zhangbo
 */
@Doc(value = "地址")
public class Address {

    @ApiField(value = "地址名称")
    public String name;

    @ApiField(value = "地址编号")
    public String code;
}
