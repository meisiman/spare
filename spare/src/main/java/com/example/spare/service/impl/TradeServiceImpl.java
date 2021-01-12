package com.example.spare.service.impl;

import com.example.spare.dao.TradeMapper;
import com.example.spare.service.TradeService;
import com.example.spare.vo.TradeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/2 11:15
 */
@Service
public class TradeServiceImpl implements TradeService {
    @Autowired
    private TradeMapper tradeMapper;


    @Override
    public List<TradeVO> queryAllTrade() {
        return tradeMapper.queryAllTrade();
    }
}
