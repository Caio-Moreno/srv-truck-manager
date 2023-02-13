package com.br.canix.srvtruckmanager.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Phone {

    private String tel;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

}
