package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiscountStatisticsDto {
    private String memberOffer;
    private String nonMemberDiscount;
}
