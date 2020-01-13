package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.beans.PmsBaseAttrInfo;
import com.atguigu.gmall.beans.PmsBaseAttrValue;
import com.atguigu.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.atguigu.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.atguigu.gmall.services.AtrrService;
import com.atguigu.gmall.services.AttrValueService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author:Mr.qiu
 * @class:AtrrServiceImpl
 * @date:2020/1/12
 */
@Service
public class AtrrServiceImpl extends ServiceImpl<PmsBaseAttrInfoMapper, PmsBaseAttrInfo> implements AtrrService {
   @Autowired
   private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;
   @Autowired
   private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

   @Autowired
   private AttrValueService attrValueService;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
       QueryWrapper<PmsBaseAttrInfo> wrapper = new QueryWrapper<>();
       wrapper.lambda().eq(PmsBaseAttrInfo::getIsEnabled,1)
                       .eq(PmsBaseAttrInfo::getCatalog3Id,catalog3Id);
        List<PmsBaseAttrInfo> list = this.list(wrapper);

        return list;
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        if (StringUtils.isEmpty(pmsBaseAttrInfo.getId())){
            //保存属性
            try {
                pmsBaseAttrInfo.setIsEnabled("1");
                boolean save = this.save(pmsBaseAttrInfo);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
            //保存属性值
            List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue attrInfo:attrValueList){
                attrInfo.setAttrId(pmsBaseAttrInfo.getId());
                attrInfo.setIsEnabled("1");
            }
            attrValueService.saveAttrValue(attrValueList);
        }else {
            // 更新
            try {
                this.updateById(pmsBaseAttrInfo);
            }catch (Exception e){
                throw new RuntimeException(e);
            }

            //修改属性值
            List<PmsBaseAttrValue> attrValueList2 = pmsBaseAttrInfo.getAttrValueList();
            attrValueService.batchModifyAttrValue(attrValueList2);

        }

        return "success";
    }

    @Override
    public List<PmsBaseAttrValue> getList(Long attrId) {
//        QueryWrapper<PmsBaseAttrInfo> wrapper = new QueryWrapper<>();
//        wrapper.lambda().eq(PmsBaseAttrInfo::getIsEnabled,1)
//                .eq(PmsBaseAttrInfo::getId,attrId);
//        PmsBaseAttrInfo pmsBaseAttrInfo;
        List<PmsBaseAttrValue> pmsBaseAttrValues;
        if (StringUtils.isEmpty(attrId)){
            throw new RuntimeException("attrId不能为空");
        }else {
            pmsBaseAttrValues =attrValueService.getAttrValueListByAttrId(attrId);
        }
        return pmsBaseAttrValues;
    }
}
