package com.example.spare.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mei Siman
 * @date 2020/12/1 17:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CusInformVO {
    //顾客号
    private int cusId;
    //零件号
    private int spareId;
    //顾客名
    private String cusName;
    //零件名
    private String spareName;
    //零件重量
    private String spareWeight;
    //零件颜色
    private String spareColor;
    //零件简介
    private String spareIntro;
    //需求量
    private int require;
}
