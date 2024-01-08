package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BillDto {
    private String createdAt;
    private Integer id	;
    private Integer plateId	;
    private String remark	;
    private Integer serviceType	;
    private Integer totalPerson	;
}
