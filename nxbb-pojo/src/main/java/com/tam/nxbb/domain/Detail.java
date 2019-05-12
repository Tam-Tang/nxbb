package com.tam.nxbb.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Detail implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    private Long id;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商品编号
     */
    private Long productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 颜色名称
     */
    private String color;

    /**
     * 尺码
     */
    private String size;

    /**
     * 商品销售价
     */
    private Float price;

    /**
     * 购买数量
     */
    private Integer amount;

}