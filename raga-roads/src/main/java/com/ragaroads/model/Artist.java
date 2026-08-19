package com.ragaroads.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artist {

    private Long artistId;
    private String artistName;
    private String artistRole;
    private String city;
    private String state;
    private Double performanceCost;
    private Boolean available;
}