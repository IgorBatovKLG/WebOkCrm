package com.example.webokcrm.Repositoryes;

import com.example.webokcrm.Models.CountProductModel;

public interface CountProductRepository {
    void update(CountProductModel countProductModel);

    CountProductModel getCountProductById(int id);
}
