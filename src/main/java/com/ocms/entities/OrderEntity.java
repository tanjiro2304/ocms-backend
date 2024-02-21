package com.ocms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "TBL_ORDER")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity{
private Long id;
private List<ItemEntity> orderItems;
private Double totalPrice;
private LocalDate orderDate;
}
