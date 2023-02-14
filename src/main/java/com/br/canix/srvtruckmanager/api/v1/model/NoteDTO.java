package com.br.canix.srvtruckmanager.api.v1.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class NoteDTO {

    private Long id;

    private String description;

    private String truckId;
    private Date date;

}
