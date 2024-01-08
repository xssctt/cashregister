package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardDto {
    private String availableEnd	;
    private String availableStart;
    private String balance;
    private CardCategoryDto cardCategoryDto;
    private Integer id	;
    private String number	;
    private Integer status;
}
