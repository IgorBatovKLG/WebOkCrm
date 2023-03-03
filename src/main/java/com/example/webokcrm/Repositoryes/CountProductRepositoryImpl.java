package com.example.webokcrm.Repositoryes;

import com.example.webokcrm.Models.CountProductModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CountProductRepositoryImpl implements CountProductRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void update(CountProductModel countProductModel){
        em.persist(countProductModel);
    }

    @Override
    public CountProductModel getCountProductById(int id){
        return em.find(CountProductModel.class, id);
    }
}
