package com.ocms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "TBL_MONTHLY_ORDER")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyOrder{
private Long id;
private List<ItemEntity> items;
private LocalDate startDate;
private LocalDate endDate;
private Double amount;
private AccountEntity account;
}
