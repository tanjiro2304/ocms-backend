package com.ocms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "TBL_SUBSCRIPTION")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionEntity {
    @Id
    @Column(name = "SUBSCRIPTION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionId;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "ORDER_ITEM",
            joinColumns = {@JoinColumn(name = "SUBSCRIPTION_ID")},
            inverseJoinColumns = {@JoinColumn(name = "ITEM_ID")}
    )
    private List<ItemEntity> items;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "AMOUNT")
    private Double amount;

    @ManyToMany(mappedBy = "subscriptionEntities")
    private List<AccountEntity> account;
}
