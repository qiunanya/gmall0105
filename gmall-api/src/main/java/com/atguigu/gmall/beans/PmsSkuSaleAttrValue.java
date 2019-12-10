package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
/**
 * sku销售属性值
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_sku_sale_attr_value")
public class PmsSkuSaleAttrValue implements Serializable {
    @TableId
    Long id;
    Long skuId;
    Long saleAttrId;
    Long saleAttrValueId;
    String saleAttrName;
    String saleAttrValueName;

}
