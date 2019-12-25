package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.beans.PmsBaseCatalog1;
import com.atguigu.gmall.beans.PmsBaseCatalog2;
import com.atguigu.gmall.beans.PmsBaseCatalog3;
import com.atguigu.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.atguigu.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.atguigu.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.atguigu.gmall.services.CatalogService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:CatalogServiceImpl
 * @date:2019/12/11
 */
@Service
public class CatalogServiceImpl extends ServiceImpl<PmsBaseCatalog1Mapper, PmsBaseCatalog1> implements CatalogService {

    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> list = this.list();

        return list;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        QueryWrapper<PmsBaseCatalog2> wrapper = new QueryWrapper<>();
        wrapper.eq("catalog1_id",catalog1Id);
        List<PmsBaseCatalog2> catalog2s = pmsBaseCatalog2Mapper.selectList(wrapper);

        return catalog2s;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        QueryWrapper<PmsBaseCatalog3> wrapper = new QueryWrapper<>();
        wrapper.eq("catalog2_id",catalog2Id);
        return pmsBaseCatalog3Mapper.selectList(wrapper);
    }
}
