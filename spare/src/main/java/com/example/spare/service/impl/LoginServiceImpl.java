package com.example.spare.service.impl;

import com.example.spare.dao.LoginMapper;
import com.example.spare.entity.Admin;
import com.example.spare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Siman
 * @date 2020/11/23 19:43
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    public void setLoginMapper(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    @Override
    public Admin login(String username, String password) {
        return loginMapper.login(username,password);
    }
}
