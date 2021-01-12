package com.example.spare.controller;

import com.example.spare.entity.Spare;
import com.example.spare.service.SpareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/26 15:48
 */
@Controller
public class SpareController {
    @Autowired
    private SpareService spareService;

    @RequestMapping("/allSpare")
    public String list(Model model) {
        List<Spare> list = spareService.queryAllSpare();
        model.addAttribute("list", list);
        return "spare/allSpare";
    }

    @RequestMapping("/toAddSpare")
    public String toAddSpare() {
        return "spare/addSpare";
    }

    @RequestMapping("/addSpare")
    public String addSspare(Spare spare) {
        System.out.println(spare);
        spareService.addSpare(spare);
        return "redirect:/allSpare";
    }

    @RequestMapping("/toUpdateSpare")
    public String toUpdateSpare(int id, Model model){
        Spare spare = spareService.querySpareById(id);
        model.addAttribute("spare",spare);
        return "spare/updateSpare";
    }

    @RequestMapping("/updateSpare")
    public String updateSpare(Spare spare){
        System.out.println(spare);
        spareService.updateSpare(spare);
        return "redirect:/allSpare";
    }

    @RequestMapping("/deleteSpare")
    public String deleteSpare(int id) {
        spareService.deleteSpareById(id);
        return "redirect:/allSpare";
    }

    @RequestMapping("/querySpare")
    public String querySpare(String spareName,Model model){
        System.out.println(spareName);
        List<Spare> spareList = spareService.querySpareByName(spareName);
        System.out.println(spareList);
        model.addAttribute("list", spareList);
        return "spare/allSpare";
    }
}
