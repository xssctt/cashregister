package com.example.cashregister.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {
    private String avatar	;
    private String birthday;
    private String createAt	;
    private Integer id;
    private String idCard;
    private String mobile;
    private String name;
    private String nickname;
    private String passwordHash	;
    private String passwordSalt	;
    private Integer point;
    private Integer sex	;
    private Integer status;
    private Integer tenantId;
    private String updateAt;
}
