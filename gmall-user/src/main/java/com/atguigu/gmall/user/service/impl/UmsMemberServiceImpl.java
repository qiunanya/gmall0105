package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.beans.UmsMemberReceiveAddress;
import com.atguigu.gmall.services.UserService;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.utils.StaticConstant;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:UserServiceImpl
 * @date:2019/10/9
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UserService {
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getList() {
        QueryWrapper<UmsMember> wrapper = new QueryWrapper<UmsMember>();
        wrapper.eq("status",StaticConstant.ONE);
        List<UmsMember> list = this.list(wrapper);
        return list;
    }

    @Override
    public IPage<UmsMember> getPage() {
        QueryWrapper<UmsMember> wrapper = new QueryWrapper<>();
        wrapper.eq("status",StaticConstant.ONE);
        Integer page = 0;
        Integer pageSize = 4;
        IPage<UmsMember> iPage = this.page(new Page<>(page, pageSize), wrapper);
        return iPage;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(Long memberId) {
        QueryWrapper<UmsMemberReceiveAddress> wrapper = new QueryWrapper<>();
        wrapper.eq("default_status",StaticConstant.ONE)
                .eq("member_id", StaticConstant.ONE);
        // 补全快捷键 ctrl + alt + v
        List<UmsMemberReceiveAddress> addressList = umsMemberReceiveAddressMapper.selectList(wrapper);
        return addressList;
    }
}
