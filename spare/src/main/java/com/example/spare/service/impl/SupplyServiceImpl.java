package com.example.spare.service.impl;

import com.example.spare.dao.SupplyMapper;
import com.example.spare.entity.Supply;
import com.example.spare.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/24 16:13
 */
@Service
public class SupplyServiceImpl implements SupplyService {
    @Autowired
    private SupplyMapper supplyMapper;

    @Override
    public int addSupply(Supply supply) {
        return supplyMapper.addSupply(supply);
    }

    @Override
    public int deleteSupplyById(int id) {
        return supplyMapper.deleteSupplyById(id);
    }

    @Override
    public int updateSupply(Supply supply) {
        return supplyMapper.updateSupply(supply);
    }

    @Override
    public List<Supply> queryAllSupply() {
        return supplyMapper.queryAllSupply();
    }

    @Override
    public Supply querySupplyById(int id) {
        return supplyMapper.querySupplyById(id);
    }

    @Override
    public List<Supply> querySupplyByName(String name) {
        return supplyMapper.querySupplyByName(name);
    }
}
