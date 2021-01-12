package com.example.spare.service;

import com.example.spare.entity.SupInform;
import com.example.spare.vo.SupInformVO;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/1 21:00
 */
public interface SupInformService {
    //新增一个供应信息
    int addSupInform(SupInform supInform);

    //删除一个供应信息
    int deleteSupInformById(int supId,int spareId);

    //修改一个供应信息
    int updateSupInform(SupInform supInform);

    //查询所有供应信息
    List<SupInformVO> queryAllSupInform();

    //查询单个供应信息
    SupInform querySupInformById(int supId,int spareId);

    //根据供应商号查询供应信息
    List<SupInformVO> querySupInformBySupId(int supId);

    //根据零件号查询供应信息
    List<SupInformVO> querySupInformBySpareId(int spareId);
}
