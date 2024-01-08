package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CraftDto {//加工方式
    private Integer id	;
    private String name	;
    private Integer sort	;
    private Integer status;

}
