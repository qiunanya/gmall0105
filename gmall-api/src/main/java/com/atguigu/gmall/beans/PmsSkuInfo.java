package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
/**
 * 库存单元表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_sku_info")
public class PmsSkuInfo implements Serializable {
    @TableId
    Long id;
    Long productId;
    BigDecimal price;
    String skuName;
    BigDecimal weight;
    String skuDesc;
    Long catalog3Id;
    String skuDefaultImg;

    @TableField(exist = false)
    List<PmsSkuImage> pmsSkuImageList;

    @TableField(exist = false)
    List<PmsSkuAttrValue> pmsSkuAttrValueList;

    @TableField(exist = false)
    List<PmsSkuSaleAttrValue> pmsSkuSaleAttrValueList;

}
