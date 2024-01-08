package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingResponseDto {
    private String appid	;
    private String createdAt;
    private String date	;
    private Integer id	;
    private Integer lineUp	;
    private String mobile	;
    private String num;
    private String openid	;
    private String qr	;
    private Integer status	;
    private Integer tenantId	;
    private Integer turnout;
    private String updatedAt	;
    private Integer waitTime	;

}
