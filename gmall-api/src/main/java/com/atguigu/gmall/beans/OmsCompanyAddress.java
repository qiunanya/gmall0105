package com.atguigu.gmall.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * 公司收发货地址表
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/12 15:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("oms_company_address")
public class OmsCompanyAddress implements Serializable {

    @TableId
    private String id;
    private String addressName;
    private Integer sendStatus;
    private Integer receiveStatus;
    private String name;
    private String phone;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

}
