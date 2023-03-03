package com.example.webokcrm.Services;


import com.example.webokcrm.Models.BuyerModel;
import com.example.webokcrm.Repositoryes.BuyerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class BuyerService {

    private BuyerRepository buyerRepository;

    public void saveBuyer(BuyerModel buyerModel){
        buyerRepository.saveBuyer(buyerModel);
        log.info("Buyer saved " + buyerModel);
    }
}
