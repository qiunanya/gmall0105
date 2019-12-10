package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 支付信息表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 15:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("payment_info")
public class PaymentInfo {
    @TableId
    private String  id;
    private String outTradeNo;
    private String orderId;
    private String alipayTradeNo;
    private BigDecimal totalAmount;
    private String Subject;
    private String paymentStatus;
    private Date createTime;
    private Date callbackTime;
    private String callbackContent;

}
