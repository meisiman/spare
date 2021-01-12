package com.example.spare.service.impl;

import com.example.spare.dao.SpareMapper;
import com.example.spare.entity.Spare;
import com.example.spare.service.SpareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/26 15:49
 */
@Service
public class SpareServiceImpl implements SpareService {
    @Autowired
    private SpareMapper spareMapper;

    @Override
    public int addSpare(Spare spare) {
        return spareMapper.addSpare(spare);
    }

    @Override
    public int deleteSpareById(int id) {
        return spareMapper.deleteSpareById(id);
    }

    @Override
    public int updateSpare(Spare spare) {
        return spareMapper.updateSpare(spare);
    }

    @Override
    public List<Spare> queryAllSpare() {
        return spareMapper.queryAllSpare();
    }

    @Override
    public Spare querySpareById(int id) {
        return spareMapper.querySpareById(id);
    }

    @Override
    public List<Spare> querySpareByName(String name) {
        return spareMapper.querySpareByName(name);
    }
}
