package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * 属性值表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_base_attr_value")
public class PmsBaseAttrValue implements Serializable {
    @TableId
    private Long id;
    private String valueName;
    private Long attrId;
    private String isEnabled;
    private String urlParam;


}
