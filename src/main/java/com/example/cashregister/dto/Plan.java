package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Plan {
    private String availableTime;
    private String beginTimestamp;
    private String createdAt;
    private String days;
    private String endTimestamp	;
    private Integer id	;
    private String name	;
    private String remark	;
    private Integer sort	;
    private Integer status;
    private Integer tenantId;
    private Integer  type	;
    private String updatedAt;
    private String week	;
}
