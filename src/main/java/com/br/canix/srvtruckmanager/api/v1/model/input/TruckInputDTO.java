package com.br.canix.srvtruckmanager.api.v1.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TruckInputDTO {

    private String description;

    private String plate;

    private String brand;

    private String year;

}
