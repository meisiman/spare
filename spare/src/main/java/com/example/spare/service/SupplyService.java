package com.example.spare.service;

import com.example.spare.entity.Supply;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/24 16:12
 */
public interface SupplyService {
    //新增一个供应商信息
    int addSupply(Supply supply);

    //删除一个供应商信息
    int deleteSupplyById(int id);

    //修改一个供应商信息
    int updateSupply(Supply supply);

    //查询全部供应商信息
    List<Supply> queryAllSupply();

    //根据id查询一个供应商信息
    Supply querySupplyById(int id);

    //搜索查询部分供应商信息（模糊查询）
    List<Supply> querySupplyByName(String name);
}
