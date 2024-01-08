package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumeDto {
    private String basePrice;
    private Integer billId;
    private CraftDto craft;
    private String createdAt;
    private Integer id	;
    private String price	;
    private Integer productId	;
    private String productName	;
    private String quantity	;
    private String remark	;
}
