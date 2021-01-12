package com.example.spare.dao;

import com.example.spare.entity.Spare;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/24 16:26
 */
@Mapper
@Repository
public interface SpareMapper {
    //新增一个零件信息
    int addSpare(Spare spare);

    //删除一个零件信息
    int deleteSpareById(@Param("spareId") int id);

    //修改一个零件信息
    int updateSpare(Spare spare);

    //查询全部零件信息
    List<Spare> queryAllSpare();

    //根据id查询一个零件信息
    Spare querySpareById(@Param("spareId") int id);

    //搜索查询部分零件信息（模糊查询）
    List<Spare> querySpareByName(@Param("spareName") String name);
}
