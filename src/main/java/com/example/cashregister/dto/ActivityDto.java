package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActivityDto {
    private Integer couponId;//优惠卷
    private String  couponName	;
    private Integer createdAt	;
    private Integer eventType	;//活动类型
    private Integer id	;
    private Integer quantity	;//数量
    private Integer status	;//状态

}
