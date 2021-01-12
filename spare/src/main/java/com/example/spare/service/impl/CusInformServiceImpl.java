package com.example.spare.service.impl;

import com.example.spare.dao.CusInformMapper;
import com.example.spare.entity.CusInform;
import com.example.spare.service.CusInformService;
import com.example.spare.vo.CusInformVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/1 16:58
 */
@Service
public class CusInformServiceImpl implements CusInformService {
    @Autowired
    private CusInformMapper cusInformMapper;

    @Override
    public int addCusInform(CusInform cusInform) {
        return cusInformMapper.addCusInform(cusInform);
    }

    @Override
    public int deleteCusInformById(int cusId, int spareId) {
        return cusInformMapper.deleteCusInformById(cusId,spareId);
    }

    @Override
    public int updateCusInform(CusInform cusInform) {
        return cusInformMapper.updateCusInform(cusInform);
    }

    @Override
    public List<CusInformVO> queryAllCusInform() {
        return cusInformMapper.queryAllCusInform();
    }

    @Override
    public CusInform queryCusInformById(int cusId, int spareId) {
        return cusInformMapper.queryCusInformById(cusId,spareId);
    }

    @Override
    public List<CusInformVO> queryCusInformByCusId(int cusId) {
        return cusInformMapper.queryCusInformByCusId(cusId);
    }

    @Override
    public List<CusInformVO> queryCusInformBySpareId(int spareId) {
        return cusInformMapper.queryCusInformBySpareId(spareId);
    }
}
