package com.example.spare.controller;

import com.example.spare.entity.CusInform;
import com.example.spare.service.CusInformService;
import com.example.spare.vo.CusInformVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/1 16:27
 */
@Controller
public class CusInformController {
    @Autowired
    private CusInformService cusInformService;

    @RequestMapping("/allCusInform")
    public String list(Model model) {
        List<CusInformVO> list = cusInformService.queryAllCusInform();
        model.addAttribute("list", list);
        return "cusInform/allCusInform";
    }

    @RequestMapping("/toAddCusInform")
    public String toAddCusInform() {
        return "cusInform/addCusInform";
    }

    @RequestMapping("/addCusInform")
    public String addCusInform(CusInform cusInform) {
        System.out.println(cusInform);
        cusInformService.addCusInform(cusInform);
        return "redirect:/allCusInform";
    }

    @RequestMapping("/toUpdateCusInform")
    public String toUpdateCusInform(int cusId,int spareId, Model model){
        CusInform cusInform = cusInformService.queryCusInformById(cusId,spareId);
        model.addAttribute("cusInform",cusInform);
        return "cusInform/updateCusInform";
    }

    @RequestMapping("/updateCusInform")
    public String updateCusInform(CusInform cusInform){
        System.out.println(cusInform);
        cusInformService.updateCusInform(cusInform);
        return "redirect:/allCusInform";
    }

    @RequestMapping("/deleteCusInform")
    public String deleteCusInform(int cusId,int spareId) {
        cusInformService.deleteCusInformById(cusId,spareId);
        return "redirect:/allCusInform";
    }

    @RequestMapping("/queryCusInformByCusId")
    public String queryCusInformByCusId(int cusId,Model model){
        List<CusInformVO> list = cusInformService.queryCusInformByCusId(cusId);
        model.addAttribute("list",list);
        return "cusInform/allCusInform";
    }

    @RequestMapping("/queryCusInformBySpareId")
    public String queryCusInformBySpareId(int spareId,Model model){
        List<CusInformVO> list = cusInformService.queryCusInformBySpareId(spareId);
        model.addAttribute("list",list);
        return "cusInform/allCusInform";
    }
}
