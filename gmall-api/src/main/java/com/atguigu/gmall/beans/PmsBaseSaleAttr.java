package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * 销售属性名称
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_base_sale_attr")
public class PmsBaseSaleAttr implements Serializable {
    @TableId
    private Long id;
    private String name;

}