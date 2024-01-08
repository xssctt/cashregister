package com.example.cashregister.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardCategory {
    private String createdAt	;
    private Integer discount	;
    private Integer discountType;
    private Integer durationDay;
    private Integer id	;
    private Integer intervalDay	;
    private String name;
    private Integer planId	;
    private Integer pointPercentage	;
    private String remark;
    private Integer sort;
    private Integer status	;
    private Integer tenantId;
    private String updatedAt;
    private Integer validType;
}
