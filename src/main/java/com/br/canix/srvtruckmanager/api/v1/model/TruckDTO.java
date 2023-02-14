package com.br.canix.srvtruckmanager.api.v1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TruckDTO {

    private Long id;
    private String description;


    private String plate;

    private String brand;

    private String year;

    private boolean enabled;

}
