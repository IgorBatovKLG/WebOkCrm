package com.example.webokcrm.Services;


import com.example.webokcrm.Models.CountProductModel;
import com.example.webokcrm.Models.ProductModel;
import com.example.webokcrm.Repositoryes.CountProductRepository;
import com.example.webokcrm.Repositoryes.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    private CountProductRepository countProductRepository;

    @Transactional
    public void saveProduct(ProductModel productModel){
        productRepository.saveProduct(productModel);
        log.info("Product saved " + productModel);
    }

    @Transactional
    public void updateProduct(ProductModel productModel){
        productRepository.updateProduct(productModel);
        log.info("Product updated " + productModel);
    }
    @ReadOnlyProperty
    public ProductModel getProductById(int id){
        return productRepository.getProductById(id);
    }

    @ReadOnlyProperty
    public CountProductModel getCount(){
        return countProductRepository.getCountProductById(1);
    }

    @Transactional
    public void updateCount(CountProductModel countProductModel){
        countProductRepository.update(countProductModel);
    }

}
