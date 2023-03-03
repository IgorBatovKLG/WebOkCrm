package com.example.webokcrm.Repositoryes;


import com.example.webokcrm.Models.PurchaseModel;

public interface PurchaseRepository {
    void savePurchase(PurchaseModel purchaseModel);

    void updatePurchase(PurchaseModel purchaseModel);

    PurchaseModel getPurchasesByBuyerId(int id);

    PurchaseModel getPurchasesbyId(int id);
}
