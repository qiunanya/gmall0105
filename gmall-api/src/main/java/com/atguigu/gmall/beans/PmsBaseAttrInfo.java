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
 * 属性表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 15:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_base_attr_info")
public class PmsBaseAttrInfo implements Serializable {

    @TableId
    private Long id;
    private String attrName;
    private String catalog3Id;
    private String isEnabled;
    @TableField(exist = false)
    private List<PmsBaseAttrValue> attrValueList;

}
