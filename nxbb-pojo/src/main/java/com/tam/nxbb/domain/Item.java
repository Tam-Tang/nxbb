package com.tam.nxbb.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 购物车中的每一条项
 *
 * @author Administrator
 */
@Setter
@Getter
public class Item implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private SuperPojo sku;//复合型的sku

    private Long skuId;//库存id （单独提出来方便操作）

    private Integer amount;//购买数量

    //有货无货的标识属性
    private Boolean isHave = true;

}
