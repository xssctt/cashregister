package com.example.cashregister.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponDto {

    private Integer  allotTogether	;
    private String  beginDate	;
    private String  createdAt	;
    private String  description	;
    private Integer  discount	;
    private Integer  distribute	;
    private String  endDate	;
    private Integer  fixedBeginTerm	;
    private Integer  fixedTerm	;
    private Integer  id	;
    private String  leastCost	;
    private String  name	;
    private String  notice	;
    private Integer  quantity	;
    private String  reduceCost	;
    private String  reduceMax;
    private Integer  status	;
    private Integer  type	;
    private Integer  validType;
}
