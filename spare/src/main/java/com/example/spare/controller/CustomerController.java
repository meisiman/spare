package com.example.spare.controller;

import com.example.spare.entity.Customer;
import com.example.spare.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/27 10:49
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/allCustomer")
    public String list(Model model) {
        List<Customer> list = customerService.queryAllCustomer();
        model.addAttribute("list", list);
        return "customer/allCustomer";
    }

    @RequestMapping("/toAddCustomer")
    public String toAddCustomer() {
        return "customer/addCustomer";
    }

    @RequestMapping("/addCustomer")
    public String addCustomer(Customer customer) {
        System.out.println(customer);
        customerService.addCustomer(customer);
        return "redirect:/allCustomer";
    }

    @RequestMapping("/toUpdateCustomer")
    public String toUpdateCustomer(int id, Model model){
        Customer customer = customerService.queryCustomerById(id);
        model.addAttribute("customer",customer);
        return "customer/updateCustomer";
    }

    @RequestMapping("/updateCustomer")
    public String updateCustomer(Customer customer){
        System.out.println(customer);
        customerService.updateCustomer(customer);
        return "redirect:/allCustomer";
    }

    @RequestMapping("/deleteCustomer")
    public String deleteCustomer(int id) {
        customerService.deleteCustomerById(id);
        return "redirect:/allCustomer";
    }

    @RequestMapping("/queryCustomer")
    public String queryCustomer(String cusName,Model model){
        System.out.println(cusName);
        List<Customer> list = customerService.queryCustomerByName(cusName);
        System.out.println(list);
        model.addAttribute("list", list);
        return "customer/allCustomer";
    }
}
