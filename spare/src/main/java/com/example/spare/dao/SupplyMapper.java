package com.example.spare.dao;

import com.example.spare.entity.Supply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/24 16:11
 */
@Mapper
@Repository
public interface SupplyMapper {
    //新增一个供应商信息
    int addSupply(Supply supply);

    //删除一个供应商信息
    int deleteSupplyById(@Param("supId") int id);

    //修改一个供应商信息
    int updateSupply(Supply supply);

    //查询全部供应商信息
    List<Supply> queryAllSupply();

    //根据id查询一个供应商信息
    Supply querySupplyById(@Param("supId") int id);

    //搜索查询部分供应商信息（模糊查询）
    List<Supply> querySupplyByName(@Param("supName") String name);
}
