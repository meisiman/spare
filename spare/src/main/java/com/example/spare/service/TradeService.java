package com.example.spare.service;

import com.example.spare.vo.TradeVO;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/2 11:14
 */
public interface TradeService {
    //查询所有可交易信息
    List<TradeVO> queryAllTrade();
}
