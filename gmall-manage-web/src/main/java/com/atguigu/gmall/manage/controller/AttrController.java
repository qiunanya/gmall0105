package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.beans.PmsBaseAttrInfo;
import com.atguigu.gmall.beans.PmsBaseAttrValue;
import com.atguigu.gmall.services.AtrrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 根据三级分类id查询商品属性列表
 * @author:Mr.qiu
 * @class:AttrController
 * @date:2020/1/12
 */
@Controller
@CrossOrigin
public class AttrController {

    @Reference
    private AtrrService atrrService;

    @PostMapping("/getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(@RequestParam Long attrId){
        List<PmsBaseAttrValue> list = atrrService.getList(attrId);
      return list;
    }

    @PostMapping("/saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        String success = atrrService.saveAttrInfo(pmsBaseAttrInfo);
        return "success";
    }

    @GetMapping("/attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){

        return atrrService.attrInfoList(catalog3Id);
    }

}
