package com.ocms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "TBL_ACCOUNT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "USER_SUBSCRIPTION",
            joinColumns = {@JoinColumn(name = "ACCOUNT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "SUBSCRIPTION_ID")}
    )
    List<SubscriptionEntity> subscriptionEntities;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID")
    private Long accountId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CONTACT_INFO")
    private String contactInfo;
    @Column(name = "EMAIL")
    private String email;
}
