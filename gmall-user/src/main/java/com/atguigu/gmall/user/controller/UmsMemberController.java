package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.beans.UmsMemberReceiveAddress;
import com.atguigu.gmall.services.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:UserController
 * @date:2019/10/9
 */
@RestController
public class UmsMemberController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public List<UmsMember> index(){
       List<UmsMember> user = userService.getList();
       return user;
    }

    @RequestMapping("/getPage")
    public IPage<UmsMember> getPage(){
        IPage<UmsMember> page =userService.getPage();
        return page;
    }

    /**
     * 根据会员id查询收货地址集合
     */
    @RequestMapping("/getUmsMemberReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(Long memberId){
        List<UmsMemberReceiveAddress> addressList = userService.getUmsMemberReceiveAddressByMemberId(memberId);
        return addressList;
    }
}
