package com.example.cashregister.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Plate {
    private Integer areaId;
    private String code;
    private String createdAt;
    private Integer id	;
    private String name;
    private Integer people;
    private Integer sort;
    private Integer status	;
    private Integer tenantId;
    private String updatedAt;
    private Integer use;
}
