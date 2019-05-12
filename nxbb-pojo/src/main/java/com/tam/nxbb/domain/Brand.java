package com.tam.nxbb.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Brand implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片Url
     */
    private String imgUrl;

    /**
     * 品牌网址
     */
    private String webSite;

    /**
     * 排序:最大最排前
     */
    private Integer sort;

    /**
     * 是否可见 1:可见 0:不可见
     */
    private Integer isDisplay;


}