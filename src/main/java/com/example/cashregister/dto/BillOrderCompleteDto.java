package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BillOrderCompleteDto {
    private Integer cardId	;//会员卡id
    private String code	;//短信验证码
    private String discount;//折扣金额
    private Integer id;//订单id
    private Integer memberId;//会员id
    private String  mobile;//手机号
    private PaymentCreateDto[] paymentCreateList;//个渠道收款金额
    private Integer  percentage;//折扣比例
    private String  remark;//备注
    private String  smallChange;//抹零 0-不抹零
}
