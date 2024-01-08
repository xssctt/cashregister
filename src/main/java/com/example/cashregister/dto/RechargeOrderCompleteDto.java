package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RechargeOrderCompleteDto {
    private Integer cardId;//会员卡Id

    private Integer id;//充值订单Id

    private Integer memberId;//会员Id

    private Integer number;//订单号

    private PaymentCreateDto[] paymentCreateDtoList;//充值总金额
    private String totalMoney;//充值总金额
}
