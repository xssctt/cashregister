package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumInfoDto {

    private Integer allowDiscount	;
    private String basePrice	;
    private Integer billId	;
    private String craft	;
    private String createdAt	;
    private Integer creatorId;
    private Integer id	;
    private Integer memberId	;
    private Integer paymentStatus;
    private Integer planId	;
    private Integer plateId	;
    private String price	;
    private Integer processStatus	;
    private Integer productId	;
    private String productName	;
    private String quantity	;
    private String remark	;
    private Integer sellerId	;
    private Integer serviceType	;
    private Integer status	;
    private Integer tenantId	;
    private String updatedAt;

}
