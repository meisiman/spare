package com.example.spare.controller;

import com.example.spare.entity.Supply;
import com.example.spare.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/24 16:09
 */
@Controller
public class SupplyController {
    @Autowired
    private SupplyService supplyService;

    @RequestMapping("/allSupply")
    public String list(Model model) {
        List<Supply> list = supplyService.queryAllSupply();
        model.addAttribute("list", list);
        return "supply/allSupply";
    }

    @RequestMapping("/toAddSupply")
    public String toAddSupply() {
        return "supply/addSupply";
    }

    @RequestMapping("/addSupply")
    public String addSupply(Supply supply) {
        System.out.println(supply);
        supplyService.addSupply(supply);
        return "redirect:/allSupply";
    }

    @RequestMapping("/toUpdateSupply")
    public String toUpdateSupply(int id, Model model){
        Supply supply = supplyService.querySupplyById(id);
        model.addAttribute("supply",supply);
        return "supply/updateSupply";
    }

    @RequestMapping("/updateSupply")
    public String updateSupply(Supply supply){
        System.out.println(supply);
        supplyService.updateSupply(supply);
        return "redirect:/allSupply";
    }

    @RequestMapping("/deleteSupply")
    public String deleteSupply(int id) {
        supplyService.deleteSupplyById(id);
        return "redirect:/allSupply";
    }

    @RequestMapping("/querySupply")
    public String querySupply(String supName,Model model){
        System.out.println(supName);
        List<Supply> supList = supplyService.querySupplyByName(supName);
        System.out.println(supList);
        model.addAttribute("list", supList);
        return "supply/allSupply";
    }
}
