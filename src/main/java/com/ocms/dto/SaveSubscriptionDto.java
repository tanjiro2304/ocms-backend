package com.ocms.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveSubscriptionDto {
    private Long userId;

    private Long subscriptionId;
}