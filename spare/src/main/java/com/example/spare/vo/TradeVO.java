package com.example.spare.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mei Siman
 * @date 2020/12/2 11:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeVO {
    //零件号
    private int spareId;
    //顾客号
    private int cusId;
    //供应商号
    private int supId;
    //零件名
    private String spareName;
    //顾客名
    private String cusName;
    //供应商名
    private String supName;
    //供应量
    private int offer;
    //需求量
    private int require;
}
