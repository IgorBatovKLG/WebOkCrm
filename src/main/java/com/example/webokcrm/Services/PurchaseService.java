package com.example.webokcrm.Services;

import com.example.webokcrm.Models.PurchaseModel;
import com.example.webokcrm.Repositoryes.PurchaseRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class PurchaseService {

    private PurchaseRepository purchaseRepository;

    @Transactional
    public void savePurchase(PurchaseModel purchaseModel){
        purchaseRepository.savePurchase(purchaseModel);
        log.info("Product saved " + purchaseModel);
    }

    public PurchaseModel getPurchase(int id){
        return purchaseRepository.getPurchasesByBuyerId(id);
    }

    public PurchaseModel getPurchaseByTrack(int track){
        //todo реализация
        return getPurchase(1);
    }
}
