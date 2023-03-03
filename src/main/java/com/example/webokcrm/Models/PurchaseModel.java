package com.example.webokcrm.Models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class PurchaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(targetEntity = BuyerModel.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    private BuyerModel buyer;

    @ManyToMany(targetEntity = ProductModel.class, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "purchase_product",
            joinColumns = @JoinColumn(name = "purchase_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<ProductModel> products;

    @Column(name = "track")
    private int track;


}
