package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {

    private String appid	;
    private String createdAt;
    private String date	;
    private Integer id	;
    private String mobile	;
    private String num	;
    private String openid	;
    private Integer status	;
    private Integer tenantId	;
    private Integer turnout	;
    private String updatedAt	;
}
