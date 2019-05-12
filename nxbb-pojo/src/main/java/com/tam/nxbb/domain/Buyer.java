package com.tam.nxbb.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class Buyer implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别:0:保密,1:男,2:女
     */
    private Integer gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 真实名字
     */
    private String realName;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 省ID
     */
    private String province;

    /**
     * 市ID
     */
    private String city;

    /**
     * 县ID
     */
    private String town;

    /**
     * 地址
     */
    private String addr;

    /**
     * 是否已删除:1:未,0:删除了
     */
    private Integer isDel;


}