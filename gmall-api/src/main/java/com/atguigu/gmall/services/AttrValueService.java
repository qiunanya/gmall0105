package com.atguigu.gmall.services;

import com.atguigu.gmall.beans.PmsBaseAttrValue;

import java.util.List;
/**
 * 属性值
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2020/1/13 21:47
 */
public interface AttrValueService {
    /**
     * 批量保存属性值
     * @param attrValueList
     */
    void saveAttrValue(List<PmsBaseAttrValue> attrValueList);

    /**
     * 批量更新属性值
     * @param attrValueList2
     */
    void batchModifyAttrValue(List<PmsBaseAttrValue> attrValueList2);

    /**
     * 根据id批量获取属性值
     * @param attrId
     * @return
     */
    List<PmsBaseAttrValue> getAttrValueListByAttrId(Long attrId);
}
