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
 * 购物车表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 15:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("oms_cart_item")
public class OmsCartItem implements Serializable{

    @TableId
    private Long id;
    private Long productId;
    private Long productSkuId;
    private Long memberId;
    private Integer quantity;
    private BigDecimal price;
    private String sp1;
    private String sp2;
    private String sp3;
    private String productPic;
    private String productName;
    private String productSubTitle;
    private String productSkuCode;
    private String memberNickname;
    private Date createDate;
    private Date modifyDate;
    private Long deleteStatus;
    private Long productCategoryId;
    private Long productBrand;
    private String productSn;
    private String productAttr;


}
