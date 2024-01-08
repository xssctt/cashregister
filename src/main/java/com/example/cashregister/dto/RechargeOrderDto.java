package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RechargeOrderDto {
    private String cardCategoryName;
    private Integer cardId;
    private String createdAt;
    private Integer id	;
    private String money;
    private String number;
    private Integer paymentStatus;
    private Integer status;
    private Integer tenantId;
    private String updatedAt;

}
