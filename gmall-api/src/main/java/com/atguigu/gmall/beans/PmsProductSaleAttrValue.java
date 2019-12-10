package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
/**
 * 商品销售值关联表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_sale_attr_value")
public class PmsProductSaleAttrValue implements Serializable {
    @TableId
    Long id ;
    Long productId;
    Long saleAttrId;
    String saleAttrValueName;
    @TableField(exist = false)
    String isChecked;

}
