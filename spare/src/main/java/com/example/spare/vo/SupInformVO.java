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
public class SupInformVO {
    //供应商号
    private int supId;
    //零件号
    private int spareId;
    //供应商名
    private String supName;
    //零件名
    private String spareName;
    //零件重量
    private String spareWeight;
    //零件颜色
    private String spareColor;
    //零件简介
    private String spareIntro;
    //供应量
    private int offer;
}
