package com.example.webokcrm.Repositoryes;

import com.example.webokcrm.Models.BuyerModel;

public interface BuyerRepository {
    void saveBuyer(BuyerModel buyerModel);

    void updateBuyer(BuyerModel buyerModel);

    BuyerModel getBuyerById(int id);

    BuyerModel getBuyerByUrl(String url);

    BuyerModel getBuyerByPhone(String phone);
}
