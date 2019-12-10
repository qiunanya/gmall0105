package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

/**
 * 会员
 * @author:Mr.qiu
 * @class:UserEntity
 * @date:2019/10/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("ums_member")
public class UmsMember implements Serializable {

    @TableId
    private Long id;
    /**
     * 会员水平ID
     */
    private Long memberLevelId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 呢称
     */
    private String nickname;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    private Integer status;
    /**
     * 注册时间
     */
    private Date createTime;
    /**
     * 头像
     */
    private String icon;
    /**
     * 性别  0->未知；1->男；2->女
     */
    private Integer gender;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 所在城市
     */
    private String city;
    /**
     * 职业
     */
    private String job;
    /**
     * 个性签名
     */
    private String personalizedSignature;
    /**
     * 客户来源
     */
    private Integer sourceType;
    /**
     * 积分
     */
    private Integer integration;
    /**
     * 成长值
     */
    private Integer growth;
    /**
     * 剩余抽奖次数
     */
    private Integer luckeyCount;
    /**
     * 历史积分数量
     */
    private Integer historyIntegration;


}
