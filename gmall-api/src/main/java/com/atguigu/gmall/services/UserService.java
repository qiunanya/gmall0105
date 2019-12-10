package com.atguigu.gmall.services;

import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.beans.UmsMemberReceiveAddress;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/9 15:32
 */
public interface UserService extends IService<UmsMember> {
    /**
     * 获取所有用户测试
     * @return
     */
    List<UmsMember> getList();

    IPage<UmsMember> getPage();
    /**
     * 根据会员id查询收货地址集合
     * @param memberId 会员id
     * @return UmsMemberReceiveAddress
     * @author：Mr.qiu
     * @version: 1.0.0.0
     * @date：2019/10/10 21:11
     */
    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(Long memberId);
}
