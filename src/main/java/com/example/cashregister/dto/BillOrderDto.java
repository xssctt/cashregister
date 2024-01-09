package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BillOrderDto {


    private String address	;
    private String areaName	;
    private Integer cardId	;
    private String createdAt	;
    private String discount	;
    private Integer id	;
    private Integer memberId	;
    private String name	;
    private String number	;
    private String paymentStatus	;
    private Integer percentage	;
    private Integer plateId	;
    private String plateName;
    private String productFee;
    private String remark	;
    private String smallChange	;
    private String status	;
    private String telephone	;
    private String totalFee	;
    private String totalPerson	;


    private PaymentDetailDto[] paymentList;
    private ConsumeDto[] consumeList;
    private CouponDto[] couponList;

}
