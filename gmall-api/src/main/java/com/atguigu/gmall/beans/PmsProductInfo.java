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
 * 商品信息表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_info")
public class PmsProductInfo implements Serializable {
    @TableId
    private Long id;
    private String productName;
    private String description;
    private  Long catalog3Id;
    @TableField(exist = false)
    private List<PmsProductSaleAttr> pmsProductSaleAttrList;
    @TableField(exist = false)
    private List<PmsProductImage> pmsProductImageList;

}


