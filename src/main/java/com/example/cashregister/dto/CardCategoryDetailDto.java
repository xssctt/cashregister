package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardCategoryDetailDto {
    private CardCategory cardCategory;
    private String planName;
}
