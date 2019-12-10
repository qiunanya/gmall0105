package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
/**
 * 商品销售关联表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_product_sale_attr")
public class PmsProductSaleAttr implements Serializable {
    @TableId
    String id ;
    String productId;
    String saleAttrId;
    String saleAttrName;
    @TableField(exist = false)
    List<PmsProductSaleAttrValue> pmsProductSaleAttrValueList;

}
