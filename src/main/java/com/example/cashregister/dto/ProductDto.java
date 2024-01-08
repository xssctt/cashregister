package com.example.cashregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    private Integer allowDiscount	;
    private Integer categoryId	;
    private String categoryName;
    private String cover;
    private String description	;
    private Integer id	;
    private String name;
    private String price;
    private Integer sort;
    private Integer status ;

}
