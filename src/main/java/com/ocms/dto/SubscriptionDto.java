package com.ocms.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionDto {
    private Long subscriptionId;

    private LocalDate startDate;

    private String planName;

    private String planDescription;

    private LocalDate endDate;

    private Double amount;

    private String validity;


}