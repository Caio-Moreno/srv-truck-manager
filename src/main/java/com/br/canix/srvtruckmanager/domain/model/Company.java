package com.br.canix.srvtruckmanager.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @OneToMany(mappedBy = "company")
    private List<Phone> phones;

    private String cnpj;

    private String stateRegistration;

    @Embedded
    private Address address;

}
