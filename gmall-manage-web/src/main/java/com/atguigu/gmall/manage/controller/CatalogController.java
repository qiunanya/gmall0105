package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.beans.PmsBaseCatalog1;
import com.atguigu.gmall.beans.PmsBaseCatalog2;
import com.atguigu.gmall.beans.PmsBaseCatalog3;
import com.atguigu.gmall.services.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:CatalogController
 * @date:2019/12/11
 */
@Controller
@CrossOrigin
public class CatalogController {

       @Reference
       CatalogService catalogService;

       @PostMapping("/getCatalog1")
       @ResponseBody
       public List<PmsBaseCatalog1> getCatalog1(){
           List<PmsBaseCatalog1>  list= catalogService.getCatalog1();
           return list;
       }

       /**
        * 获取二级分类
        * */
       @PostMapping("/getCatalog2")
       @ResponseBody
       public List<PmsBaseCatalog2> getCatalog2(@RequestParam String catalog1Id){
           List<PmsBaseCatalog2>  catalog2 = catalogService.getCatalog2(catalog1Id);
           return catalog2;
       }

       /**
        * 获取三级分类
        * getCatalog3
        * */
       @PostMapping("/getCatalog3")
       @ResponseBody
       public List<PmsBaseCatalog3> getCatalog3(@RequestParam String catalog2Id){
           List<PmsBaseCatalog3>  catalog3 = catalogService.getCatalog3(catalog2Id);
           return catalog3;
       }

}
