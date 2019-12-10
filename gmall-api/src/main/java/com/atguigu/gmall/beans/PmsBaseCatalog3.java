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
 * 三级分类表
 * @author:Mr.qiu
 * @class:PmsBaseCatalog3
 * @date:2019/10/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_base_catalog3")
public class PmsBaseCatalog3 implements Serializable {
    @TableId
    private Long id;
    private String name;
    private Long catalog1Id;

}
