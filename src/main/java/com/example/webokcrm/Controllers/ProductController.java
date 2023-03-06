package com.example.webokcrm.Controllers;

import com.example.webokcrm.Models.ProductModel;
import com.example.webokcrm.Services.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@Slf4j
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping("/product/add_index")
    public String addProductIndex(){
        return "product/add_index";
    }

//    @PostMapping("/product/add_product")
//    public String addProductPOST(){
//        log.info("Product added");
//        return "redirect:/product/add_index";
//    }

    @PostMapping("/product/add_product_csv")
    public String addProductPOSTCSV(@RequestParam("text") String text){
        String[] split = text.split("\n");
        ArrayList<ProductModel> productModels = new ArrayList<>();
        for (String s : split) {
            String[] split1 = s.split(";");
            productModels.add(new ProductModel(0, Integer.parseInt(split1[0]), split1[1], Integer.parseInt(split1[2]), Integer.parseInt(split1[3]), Integer.parseInt(split1[4]), split1[5], split1[6], split1[7], split1[8]));
        }
        for (ProductModel productModel : productModels) {
            productService.saveProduct(productModel);
        }
        log.info("Product added with CSV");
        return "redirect:/product/add_index";
    }
//
//    @GetMapping("/product/list")
//    public String productList(){
//        return "product/list";
//    }
//
//    @GetMapping("/product/update")
//    public String updateProduct(String id){
//        return "product/update";
//    }
//
//    @PostMapping("/product/update")
//    public String updateProduct(){
//        return "redirect:/product/list";
//    }
}
