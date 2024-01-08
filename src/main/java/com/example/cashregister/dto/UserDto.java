package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private String avatar;
    private String createdAt;
    private String email;
    private Integer id;
    private String mobile	;
    private String  name;
    private Integer status;
}
