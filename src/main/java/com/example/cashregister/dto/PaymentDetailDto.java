package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDetailDto {

    private Integer id	;
    private String money	;
    private String orderNumber	;
    private Integer orderType	;
    private Integer paymentChannelId	;
    private String  paymentChannelName;
    private String  tradeNumber;
}
