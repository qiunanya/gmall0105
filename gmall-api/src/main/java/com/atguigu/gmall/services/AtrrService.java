package com.atguigu.gmall.services;

import com.atguigu.gmall.beans.PmsBaseAttrInfo;
import com.atguigu.gmall.beans.PmsBaseAttrValue;

import java.util.List;

/**
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2020/1/12 18:08
 */
public interface AtrrService {
    /**
     * 根据三级分类id查询属性列表
     *@author：Mr.qiu
     *@version: 1.0.0.0
     *@date：2020/1/12 18:02
     *@param catalog3Id
     *@return PmsBaseAttrInfo
     */
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    /**
     * 保存平台属性
     * @param pmsBaseAttrInfo
     * @return
     */
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    /**
     * 批量查询
     * @param attrId
     * @return
     */
    List<PmsBaseAttrValue> getList(Long attrId);
}
