package com.example.spare.service;

import com.example.spare.entity.CusInform;
import com.example.spare.vo.CusInformVO;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/1 16:57
 */
public interface CusInformService {
    //新增一个顾客需求信息
    int addCusInform(CusInform cusInform);

    //删除一个顾客需求信息
    int deleteCusInformById(int cusId,int spareId);

    //修改一个顾客需求信息
    int updateCusInform(CusInform cusInform);

    //查询所有顾客需求信息
    List<CusInformVO> queryAllCusInform();

    //查询单个顾客需求信息
    CusInform queryCusInformById(int cusId,int spareId);

    //根据顾客号查询顾客需求信息
    List<CusInformVO> queryCusInformByCusId(int cusId);

    //根据零件号查询顾客需求信息
    List<CusInformVO> queryCusInformBySpareId(int spareId);
}
