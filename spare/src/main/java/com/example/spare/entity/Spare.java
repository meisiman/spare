package com.example.spare.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mei Siman
 * @date 2020/11/23 16:50
 *
 * 零件实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Spare {
    //零件号
    private int spareId;
    //零件名
    private String spareName;
    //零件重量
    private String spareWeight;
    //零件颜色
    private String spareColor;
    //零件简介
    private String spareIntro;
}
