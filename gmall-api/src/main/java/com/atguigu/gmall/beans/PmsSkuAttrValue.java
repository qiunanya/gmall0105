package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
/**
 * sku平台属性值关联表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_sku_attr_value")
public class PmsSkuAttrValue implements Serializable {
    @TableId
    Long id;
    Long attrId;
    Long valueId;
    Long skuId;

}
