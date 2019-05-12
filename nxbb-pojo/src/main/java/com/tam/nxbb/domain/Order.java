package com.tam.nxbb.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID或订单号
     */
    private Long id;

    /**
     * 运费
     */
    private Float deliverFee;

    /**
     * 应付金额
     */
    private Float totalPrice;

    /**
     * 订单金额
     */
    private Float orderPrice;

    /**
     * 支付方式 0:到付 1:在线 2:邮局 3:公司转帐
     */
    private Integer paymentWay;

    /**
     * 货到付款方式.1现金,2POS刷卡
     */
    private Integer paymentCash;

    /**
     * 送货时间
     */
    private Integer delivery;

    /**
     * 是否电话确认 1:是  0: 否
     */
    private Integer isConfirm;

    /**
     * 支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败
     */
    private Integer isPaiy;

    /**
     * 订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货
     */
    private Integer orderState;

    /**
     * 订单生成时间
     */
    private Date createDate;

    /**
     * 附言
     */
    private String note;

    /**
     * 用户ID
     */
    private Long buyerId;

}