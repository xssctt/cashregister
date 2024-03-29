package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignatureDto {
    private String callback	;
    private String expire;
    private String  host;
    private String  key;
    private String  ossaccessKeyId;
    private String  policy;
    private String   signature;
}
