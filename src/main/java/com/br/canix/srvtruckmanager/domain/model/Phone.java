package com.br.canix.srvtruckmanager.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tel;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

}
