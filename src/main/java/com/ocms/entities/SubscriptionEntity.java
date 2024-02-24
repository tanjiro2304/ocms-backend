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

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "PLAN_NAME")
    private String planName;

    @Column(name = "PLAN_DESCRIPTION")
    private String planDescription;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "Validity")
    private String validity;

    @ManyToMany(mappedBy = "subscriptionEntities")
    private List<AccountEntity> account;
}

