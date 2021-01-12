package com.example.spare.dao;

import com.example.spare.vo.TradeVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/2 11:17
 */
@Mapper
@Repository
public interface TradeMapper {
    //查询所有可交易信息
    List<TradeVO> queryAllTrade();
}
