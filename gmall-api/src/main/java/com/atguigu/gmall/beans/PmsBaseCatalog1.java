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
 * 一级分类表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 15:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_base_catalog1")
public class PmsBaseCatalog1 implements Serializable {
    @TableId
    private Long id;
    private String name;

    @TableField(exist = false)
    private List<PmsBaseCatalog2> catalog2s;

}

