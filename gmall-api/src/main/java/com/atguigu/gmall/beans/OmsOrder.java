package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 订单表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 15:38
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order")
public class OmsOrder implements Serializable {
    @TableId
    private Long id;
    private Long memberId;
    private Long couponId;
    private String orderSn;
    private Date createTime;
    private String memberUsername;
    private BigDecimal totalAmount;
    private BigDecimal payAmount;
    private BigDecimal freightAmount;
    private BigDecimal promotionAmount;
    private BigDecimal integrationAmount;
    private BigDecimal couponAmount;
    private BigDecimal discountAmount;
    private Integer  payType;
    private Integer sourceType;
    private Integer status;
    private Integer orderType;
    private String deliveryCompany;
    private String deliverySn;
    private Integer autoConfirmDay;
    private Integer integration;
    private Integer growth;
    private String promotionInfo;
    private Integer billType;
    private String billHeader;
    private String billContent;
    private String billReceiverPhone;
    private String billReceiverEmail;
    private String receiverName;
    private String receiverPhone;
    private String receiverPostCode;
    private String receiverProvince;
    private String receiverCity;
    private String receiverRegion;
    private String receiverDetailAddress;
    private String note;
    private Integer confirmStatus;
    private Integer deleteStatus;
    private Integer useIntegration;
    private Date paymentTime;
    private Date deliveryTime;
    private Date receiveTime;
    private Date commentTime;
    private Date modifyTime;

}
