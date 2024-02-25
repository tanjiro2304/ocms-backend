package com.ocms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "TBL_ORDER")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    @Id
    @Column(name="ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToMany
    @JoinTable(
            name = "ORDER_ITEM",
            joinColumns = {@JoinColumn(name = "ORDER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "ITEM_ID")}
    )
    private List<ItemEntity> orderItems;

    @Column(name = "TOTAL_PRICE")
    private Double totalPrice;

    @Column(name = "ORDER_DATE")
    private LocalDate orderDate;

    @Enumerated(value = EnumType.STRING)
    private Status orderStatus;
}