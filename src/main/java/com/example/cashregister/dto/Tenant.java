package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tenant {

    private String address;
    private String createdAt;
    private Integer id	;
    private String name;
    private String picture	;
    private Integer status;
    private String  telephone	;
    private String  updatedAt;
    private Integer userId;
}
