package com.example.webokcrm.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class BuyerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "url")
    private String url;
    @Column(name = "last_buy_day")
    private String lastBuyDay;
    @Column(name = "total_amount_purchases")
    private int totalAmountPurchases;

}
