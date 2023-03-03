package com.example.webokcrm.Controllers.API;


import com.example.webokcrm.Models.CountProductModel;
import com.example.webokcrm.Models.ProductModel;
import com.example.webokcrm.Services.ProductService;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductControllerRest {

    private ProductService productService;
    private Gson gson;

    @GetMapping("/product/get_json")
    public String getProduct(){
        CountProductModel count = productService.getCount();
        ProductModel product = productService.getProductById(count.getCount());
        return gson.toJson(product).toString();
    }

    @GetMapping("/product/add_count")
    public String addCount(){
        try {
            CountProductModel count = productService.getCount();
            count.setCount(count.getCount() + 1);
            productService.updateCount(count);
            return "ok";
        } catch (Exception e) {
            return "error";
        }
    }
}
