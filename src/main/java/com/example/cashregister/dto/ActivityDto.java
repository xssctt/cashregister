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
    private Integer couponId;
    private String  couponName	;
    private Integer createdAt	;
    private Integer eventType	;
    private Integer id	;
    private Integer quantity	;
    private Integer status	;

}
