package com.example.spare.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mei Siman
 * @date 2020/11/23 16:47
 *
 * 顾客实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    //顾客号
    private int cusId;
    //顾客名
    private String cusName;
    //顾客地址
    private String cusAddress;
    //顾客电话
    private String cusPhone;
}
