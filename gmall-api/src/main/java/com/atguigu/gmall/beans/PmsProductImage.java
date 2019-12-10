package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * 商品图片表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_image")
public class PmsProductImage implements Serializable {
    @TableId
    private Long id;
    private Long productId;
    private String imgName;
    private String imgUrl;

}