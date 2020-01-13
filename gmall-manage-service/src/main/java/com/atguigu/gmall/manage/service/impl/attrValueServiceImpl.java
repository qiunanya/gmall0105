package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.beans.PmsBaseAttrValue;
import com.atguigu.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.atguigu.gmall.services.AttrValueService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:attrValueServiceImpl
 * @date:2020/1/13
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class attrValueServiceImpl extends ServiceImpl<PmsBaseAttrValueMapper, PmsBaseAttrValue> implements AttrValueService {


    @Override
    public void saveAttrValue(List<PmsBaseAttrValue> attrValueList) {

        try {
            this.saveBatch(attrValueList);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void batchModifyAttrValue(List<PmsBaseAttrValue> attrValueList2) {
        try {
            this.updateBatchById(attrValueList2);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueListByAttrId(Long attrId) {
        QueryWrapper<PmsBaseAttrValue> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(PmsBaseAttrValue::getAttrId,attrId)
                .eq(PmsBaseAttrValue::getIsEnabled,"1");
        List<PmsBaseAttrValue> list;
        try {
             list = this.list(wrapper);
        }catch (Exception e){
            throw new RuntimeException("根据iD批量查询属性值失败");
        }

        return list;
    }
}
