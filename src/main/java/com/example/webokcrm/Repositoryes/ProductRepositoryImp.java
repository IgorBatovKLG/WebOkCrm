package com.example.webokcrm.Repositoryes;

import com.example.webokcrm.Models.ProductModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImp implements ProductRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveProduct(ProductModel productModel) {
        em.persist(productModel);
    }

    @Override
    public void updateProduct(ProductModel productModel){
        em.merge(productModel);
    }

    @Override
    public ProductModel getProductById(int id){
        return em.find(ProductModel.class, id);
    }
}
