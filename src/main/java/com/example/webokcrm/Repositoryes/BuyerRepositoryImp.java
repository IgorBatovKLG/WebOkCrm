package com.example.webokcrm.Repositoryes;

import com.example.webokcrm.Models.BuyerModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class BuyerRepositoryImp implements BuyerRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveBuyer(BuyerModel buyerModel){
        em.persist(buyerModel);
    }

    @Override
    public void updateBuyer(BuyerModel buyerModel){
        em.merge(buyerModel);
    }

    @Override
    public BuyerModel getBuyerById(int id){
        return em.find(BuyerModel.class, id);
    }

    @Override
    public BuyerModel getBuyerByUrl(String url){
        return em.createQuery("SELECT b FROM BuyerModel b WHERE b.url = :url", BuyerModel.class)
                .setParameter("url", url)
                .getSingleResult();
    }

    @Override
    public BuyerModel getBuyerByPhone(String phone){
        return em.createQuery("SELECT b FROM BuyerModel b WHERE b.phone = :phone", BuyerModel.class)
                .setParameter("phone", phone)
                .getSingleResult();
    }
}
