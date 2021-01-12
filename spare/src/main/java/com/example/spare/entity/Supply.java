package com.example.spare.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mei Siman
 * @date 2020/11/23 16:52
 *
 * 供应商实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supply {
    //供应商号
    private int supId;
    //供应商名
    private String supName;
    //供应商地址
    private String supAddress;
    //供应商电话
    private String supPhone;
    //供应商简介
    private String supIntro;
}
