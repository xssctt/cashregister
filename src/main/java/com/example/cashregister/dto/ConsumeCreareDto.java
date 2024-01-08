package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumeCreareDto {
    private Integer[] craftIdList;
    private Integer productId;//商品ID
    private String quantity;//^[0-9]+(\.[0-9])?$数量
    private String remark;//备注
    private Integer serviceType;//服务方式：1、堂食，2、外卖

}
