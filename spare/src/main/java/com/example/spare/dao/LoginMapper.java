package com.example.spare.dao;

import com.example.spare.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Mei Siman
 * @date 2020/11/23 19:41
 *
 * sql映射
 */
@Mapper
@Repository
public interface LoginMapper {
    Admin login(@Param("username") String username,@Param("password") String password);
}
