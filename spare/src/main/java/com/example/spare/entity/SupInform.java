package com.example.spare.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mei Siman
 * @date 2020/11/23 18:21
 *
 * 供应联系实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupInform {
    //供应商号
    private int supId;
    //零件号
    private int spareId;
    //供应量
    private int offer;
}
