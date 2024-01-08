package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingPrefixDto {
    private Integer id;
    private String name;//桌号名
    private String prefix	;
    private Integer turnout	;//客人数量
}
