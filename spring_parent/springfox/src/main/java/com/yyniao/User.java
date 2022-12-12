package com.yyniao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/18 17:34
 */
@ApiModel("用户基本信息")
public class User {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("邮箱")
    private String email;

    public User(String name, Integer age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }
}
