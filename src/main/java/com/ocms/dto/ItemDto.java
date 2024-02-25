package com.ocms.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDto {

    private Long itemId;

    private String itemName;

    private Double itemPrice;

    private Integer itemQuantity;
}