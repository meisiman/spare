package com.example.spare.service;

import com.example.spare.entity.Admin;

/**
 * @author Mei Siman
 * @date 2020/11/23 19:42
 */
public interface LoginService {
    Admin login(String username, String password);
}
