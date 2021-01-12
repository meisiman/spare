package com.example.spare.controller;

import com.example.spare.entity.Admin;
import com.example.spare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mei Siman
 * @date 2020/11/23 15:59
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username,String password,Model model){
        System.out.println(username);
        System.out.println(password);
        Admin admin = loginService.login(username,password);
        if (admin!=null){
            model.addAttribute("admin",admin);
            return "redirect:/allSupply";
        }else return "login";
    }
}
