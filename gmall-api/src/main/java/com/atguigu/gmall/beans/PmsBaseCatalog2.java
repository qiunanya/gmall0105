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
 * 二级分类
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 15:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_base_catalog2")
public class PmsBaseCatalog2 implements Serializable {
    @TableId
    private Long id;
    private String name;
    private Long catalog1Id;
    @TableField(exist = false)
    private List<PmsBaseCatalog3> catalog3List;

}
