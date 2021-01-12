package com.example.spare.dao;

import com.example.spare.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/24 16:26
 */
@Mapper
@Repository
public interface CustomerMapper {
    //新增一个顾客信息
    int addCustomer(Customer customer);

    //删除一个顾客信息
    int deleteCustomerById(@Param("cusId") int id);

    //修改一个顾客信息
    int updateCustomer(Customer customer);

    //查询全部顾客信息
    List<Customer> queryAllCustomer();

    //根据id查询一个顾客信息
    Customer queryCustomerById(@Param("cusId") int id);

    //搜索查询部分顾客信息（模糊查询）
    List<Customer> queryCustomerByName(@Param("cusName") String name);
}
