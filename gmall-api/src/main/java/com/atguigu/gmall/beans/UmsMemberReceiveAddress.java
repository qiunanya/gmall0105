package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员收货地址
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/10 21:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("ums_member_receive_address")
public class UmsMemberReceiveAddress implements Serializable {
    @TableId
    private Long id;
    private Long memberId;
    private String  name;
    private String  phoneNumber;
    private Integer defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

}
