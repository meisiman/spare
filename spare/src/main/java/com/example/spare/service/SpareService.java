package com.example.spare.service;

import com.example.spare.entity.Spare;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/26 15:49
 */
public interface SpareService {
    //新增一个零件信息
    int addSpare(Spare spare);

    //删除一个零件信息
    int deleteSpareById(int id);

    //修改一个零件信息
    int updateSpare(Spare spare);

    //查询全部零件信息
    List<Spare> queryAllSpare();

    //根据id查询一个零件信息
    Spare querySpareById(int id);

    //搜索查询部分零件信息（模糊查询）
    List<Spare> querySpareByName(String name);
}
