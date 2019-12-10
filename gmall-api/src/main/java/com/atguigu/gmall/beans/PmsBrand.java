package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * 品牌表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 16:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_brand")
public class PmsBrand implements Serializable {
    @TableId
    private Long id;
    private String name;
    private String firstLetter;
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private Integer productCount;
    private String productCommentCount;
    private String logo;
    private String bigPic;
    private String brandStory;

}
