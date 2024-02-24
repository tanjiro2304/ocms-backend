package com.ocms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "TBL_ITEM")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItemEntity {

    @ManyToMany(mappedBy = "orderItems")
    List<OrderEntity> orderEntities;
    @Id
    @Column(name = "ITEM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    @Column(name = "ITEM_NAME")
    private String itemName;
    @Column(name = "ITEM_PRICE")
    private Double itemPrice;
    @ManyToMany(mappedBy = "items")
    private List<SubscriptionEntity> subscriptionEntities;
}
