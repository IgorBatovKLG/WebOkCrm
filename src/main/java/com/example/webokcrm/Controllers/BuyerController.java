package com.example.webokcrm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuyerController {

    @GetMapping("/buyer/add_index")
    public String addBuyerIndex(){
        return "buyer/add_index";
    }

    @PostMapping("/buyer/add_buyer")
    public String addBuyer(@RequestParam("name") String name,
                           @RequestParam("phone") String phone,
                           @RequestParam("url") String url){
        return "redirect:/buyer/add_index";
    }
//
//    @GetMapping("/buyer/list")
//    public String buyerList(){
//        return "buyer/list";
//    }
//
//    @GetMapping("/buyer/update")
//    public String updateBuyer(String id){
//        return "buyer/update";
//    }
//
//    @GetMapping("/buyer/update")
//    public String updateBuyer(){
//        return "redirect:/buyer/list";
//    }
}
