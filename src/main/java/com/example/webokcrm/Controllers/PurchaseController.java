package com.example.webokcrm.Controllers;

import com.example.webokcrm.Models.PurchaseModel;
import com.example.webokcrm.Services.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class PurchaseController {

    private PurchaseService purchaseService;

    @GetMapping("/track")
    public String trackStatus(@RequestParam(name = "track", required = false, defaultValue = "") String track,
                              Model model){
        PurchaseModel purchaseByTrack = purchaseService.getPurchaseByTrack(Integer.parseInt(track));
        model.addAttribute("purchase", purchaseByTrack);
        return "track/info";
    }
}
