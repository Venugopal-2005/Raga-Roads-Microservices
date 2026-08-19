package com.ragaroads.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Concert {

    private Long concertId;
    private String concertTitle;
    private String concertDate;
    private String concertTime;
    private String concertCity;
    private String concertState;
    private String strategyType;
    private String artistRole;
    private Double budgetAllocated;
}