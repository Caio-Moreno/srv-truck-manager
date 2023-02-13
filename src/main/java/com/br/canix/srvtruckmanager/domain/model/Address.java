package com.br.canix.srvtruckmanager.domain.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {

    private String address;
    private String district;
    private String cep;
    private String city;
    private String state;

}
