package com.example.spare.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mei Siman
 * @date 2020/11/23 18:19
 *
 * 顾客需求实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CusInform {
    //顾客号
    private int cusId;
    //零件号
    private int spareId;
    //需求量
    private int require;
}
