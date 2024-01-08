package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TickerDto {
    private Integer allotTogether	;
    private String code	;
    private Integer couponId;
    private String  couponName;
    private String  exchangeDate;
    private Integer id	;
    private Integer  memberId	;
    private Integer orderId	;
    private String  reduceCost;
    private Integer status;
}
