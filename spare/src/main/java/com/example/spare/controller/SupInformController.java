package com.example.spare.controller;

import com.example.spare.entity.SupInform;
import com.example.spare.service.SupInformService;
import com.example.spare.vo.CusInformVO;
import com.example.spare.vo.SupInformVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/1 20:50
 */
@Controller
public class SupInformController {
    @Autowired
    private SupInformService supInformService;

    @RequestMapping("/allSupInform")
    public String list(Model model) {
        List<SupInformVO> list = supInformService.queryAllSupInform();
        model.addAttribute("list", list);
        return "supInform/allSupInform";
    }

    @RequestMapping("/toAddSupInform")
    public String toAddSupInform() {
        return "supInform/addSupInform";
    }

    @RequestMapping("/addSupInform")
    public String addSupInform(SupInform supInform) {
        System.out.println(supInform);
        supInformService.addSupInform(supInform);
        return "redirect:/allSupInform";
    }

    @RequestMapping("/toUpdateSupInform")
    public String toUpdateSupInform(int supId,int spareId, Model model){
        SupInform supInform = supInformService.querySupInformById(supId,spareId);
        model.addAttribute("supInform",supInform);
        return "supInform/updateSupInform";
    }

    @RequestMapping("/updateSupInform")
    public String updateSupInform(SupInform supInform){
        System.out.println(supInform);
        supInformService.updateSupInform(supInform);
        return "redirect:/allSupInform";
    }

    @RequestMapping("/deleteSupInform")
    public String deleteSupInform(int supId,int spareId) {
        supInformService.deleteSupInformById(supId,spareId);
        return "redirect:/allSupInform";
    }

    @RequestMapping("/querySupInformBySupId")
    public String querySupInformBySupId(int supId,Model model){
        List<SupInformVO> list = supInformService.querySupInformBySupId(supId);
        model.addAttribute("list",list);
        return "supInform/allSupInform";
    }

    @RequestMapping("/querySupInformBySpareId")
    public String querySupInformBySpareId(int spareId,Model model){
        List<SupInformVO> list = supInformService.querySupInformBySpareId(spareId);
        model.addAttribute("list",list);
        return "supInform/allSupInform";
    }
}
