package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.beans.UmsMemberReceiveAddress;
import com.atguigu.gmall.services.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:UserController
 * @date:2019/10/9
 */
@Controller
@RequestMapping(value = "/user")
public class UmsMemberController {

    @Reference
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public List<UmsMember> index(){
       List<UmsMember> user = userService.getList();
       return user;
    }

    @RequestMapping("/getPage")
    @ResponseBody
    public IPage<UmsMember> getPage(){
        IPage<UmsMember> page =userService.getPage();
        return page;
    }

    /**
     * 根据会员id查询收货地址集合
     */
    @RequestMapping("/getUmsMemberReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(Long memberId){
        List<UmsMemberReceiveAddress> addressList = userService.getUmsMemberReceiveAddressByMemberId(memberId);
        return addressList;
    }
}
