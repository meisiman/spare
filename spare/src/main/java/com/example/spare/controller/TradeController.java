package com.example.spare.controller;

import com.example.spare.entity.CusInform;
import com.example.spare.entity.SupInform;
import com.example.spare.service.CusInformService;
import com.example.spare.service.SupInformService;
import com.example.spare.service.TradeService;
import com.example.spare.vo.TradeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/12/1 21:30
 */
@Controller
public class TradeController {
    @Autowired
    private CusInformService cusInformService;
    @Autowired
    private SupInformService supInformService;
    @Autowired
    private TradeService tradeService;

    @RequestMapping("/toTrade")
    public String toTrade(int spareId,int cusId,int supId,int offer,int require,Model model) {
        model.addAttribute("spareId",spareId);
        model.addAttribute("cusId",cusId);
        model.addAttribute("supId",supId);
        model.addAttribute("offer",offer);
        model.addAttribute("require",require);
        return "trade/addTrade";
    }

    @RequestMapping("/addTrade")
    public String trade(int spareId,int cusId,int supId,int trade) {
        System.out.print(spareId+" "+cusId+" "+supId);
        CusInform cusInform = cusInformService.queryCusInformById(cusId,spareId);
        int require = cusInform.getRequire()-trade;
        cusInformService.updateCusInform(new CusInform(cusId,spareId,require));
        SupInform supInform = supInformService.querySupInformById(supId,spareId);
        int offer = supInform.getOffer()-trade;
        supInformService.updateSupInform(new SupInform(supId,spareId,offer));
        return "redirect:/trade";
    }

    @RequestMapping("/trade")
    public String list(Model model){
        List<TradeVO> list = tradeService.queryAllTrade();
        model.addAttribute("list",list);
        return "trade/trade";
    }
}
