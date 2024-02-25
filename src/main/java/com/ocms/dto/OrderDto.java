package com.ocms.dto;

import com.ocms.entities.ItemEntity;
import com.ocms.entities.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDto {
    private Long id;
    private List<ItemDto> orderItems;
    private Double totalPrice;
    private LocalDate orderDate;
    private Status orderStatus;
}