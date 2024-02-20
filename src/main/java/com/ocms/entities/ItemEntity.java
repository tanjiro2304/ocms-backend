package com.ocms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "TBL_ITEM")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItemEntity {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="ITEM_NAME")
    private String itemName;

    @Column(name="ITEM_PRICE")
    private Double itemPrice;
    
}
