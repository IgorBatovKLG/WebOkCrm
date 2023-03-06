package com.example.webokcrm.Repositoryes;

import com.example.webokcrm.Models.PurchaseModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseRepositoryImp implements PurchaseRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void savePurchase(PurchaseModel purchaseModel){
        em.persist(purchaseModel);
    }

    @Override
    public void updatePurchase(PurchaseModel purchaseModel){
        em.merge(purchaseModel);
    }

    @Override
    public PurchaseModel getPurchasesByBuyerId(int id){
        return em.find(PurchaseModel.class, id);
    }

    @Override
    public PurchaseModel getPurchasesbyId(int id){
        return em.find(PurchaseModel.class, id);
    }
    @Override
    public PurchaseModel getPurchaseByTrack(int track){
        return em.createQuery("select p from PurchaseModel p where p.track = :track", PurchaseModel.class)
                .setParameter("track", track)
                .getSingleResult();
    }

}
