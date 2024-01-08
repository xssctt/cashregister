package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WechatTemplate {

    private String   appid;
    private String   booking;
    private String   createdAt;
    private Integer   id;
    private String    note;
    private Integer    status;
    private Integer    tenantId;
    private String    updatedAt	;
}
