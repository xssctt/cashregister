package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTenantDto {
    private String address;//地址

    private String name;//商家名称

    private String picture;//封面图片

    private String telephone;//电话
}
