package com.tam.nxbb.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 颜色ID
     */
    private Long colorId;


    /**
     * 尺码
     */
    private String size;

    /**
     * 市场价
     */
    private Float marketPrice;

    /**
     * 售价
     */
    private Float price;

    /**
     * 运费 默认10元
     */
    private Float deliveFee;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 购买限制
     */
    private Integer upperLimit;

    private Date createTime;

}