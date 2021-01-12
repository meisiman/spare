package com.example.spare.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mei Siman
 * @date 2020/11/23 16:32
 *
 * 交易员实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    //交易员号
    private int userId;
    //交易员名
    private String username;
    //交易员密码
    private String password;
}
