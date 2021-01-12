package com.example.spare.service.impl;

import com.example.spare.dao.SupInformMapper;
import com.example.spare.entity.*;
import com.example.spare.service.SupInformService;
import com.example.spare.vo.SupInformVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/1 21:00
 */
@Service
public class SupInformServiceImpl implements SupInformService {
    @Autowired
    private SupInformMapper supInformMapper;

    @Override
    public int addSupInform(SupInform supInform) {
        return supInformMapper.addSupInform(supInform);
    }

    @Override
    public int deleteSupInformById(int supId, int spareId) {
        return supInformMapper.deleteSupInformById(supId,spareId);
    }

    @Override
    public int updateSupInform(SupInform supInform) {
        return supInformMapper.updateSupInform(supInform);
    }

    @Override
    public List<SupInformVO> queryAllSupInform() {
        return supInformMapper.queryAllSupInform();
    }

    @Override
    public SupInform querySupInformById(int supId, int spareId) {
        return supInformMapper.querySupInformById(supId,spareId);
    }

    @Override
    public List<SupInformVO> querySupInformBySupId(int supId) {
        return supInformMapper.querySupInformBySupId(supId);
    }

    @Override
    public List<SupInformVO> querySupInformBySpareId(int spareId) {
        return supInformMapper.querySupInformBySpareId(spareId);
    }
}
