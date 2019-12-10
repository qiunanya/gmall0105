package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
/**
 * 库存单元图片表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_sku_image")
public class PmsSkuImage implements Serializable {
    @TableId
    Long id;
    Long skuId;
    String imgName;
    String imgUrl;
    Long productImgId;
    String isDefault;
}