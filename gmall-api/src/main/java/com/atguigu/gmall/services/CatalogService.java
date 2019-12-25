package com.atguigu.gmall.services;

import com.atguigu.gmall.beans.PmsBaseCatalog1;
import com.atguigu.gmall.beans.PmsBaseCatalog2;
import com.atguigu.gmall.beans.PmsBaseCatalog3;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
/**
 * 一级目录查询
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/12/11 23:09
 */
public interface CatalogService extends IService<PmsBaseCatalog1> {
     /**
      * 获取一级分类集合
      *@author：Mr.qiu
      *@version: 1.0.0.0
      *@date：2019/12/11 23:09
      * @return
      */
     List<PmsBaseCatalog1> getCatalog1();
    /**
     * 根据一级id获取二级分类
     * @param catalog1Id 一级分类id
     * @return
     * */
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);
    /**
     * 根据二级id获取三级分类
     * @param catalog2Id 二级分类id
     * @return
     * */
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
