package com.example.webokcrm.Repositoryes;

import com.example.webokcrm.Models.ProductModel;

public interface ProductRepository {
    void saveProduct(ProductModel productModel);

    void updateProduct(ProductModel productModel);

    ProductModel getProductById(int id);
}
