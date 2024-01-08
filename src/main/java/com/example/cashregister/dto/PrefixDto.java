package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrefixDto {
    private Integer id;
    private String name	;
    private String prefix	;
    private Integer status;
    private Integer tenantId;
    private Integer turnout	;

}
