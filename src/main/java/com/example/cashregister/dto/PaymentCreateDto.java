package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentCreateDto {
    private Integer allotTogether;
    private String money;//^[0-9]+(\.[0-9]{1,2})?$   收款金额
    private Integer paymentChannelId;//支付渠道ID
    private String ticketCode;//核销码
}
