package com.br.canix.srvtruckmanager.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Truck {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @Column(nullable = false)
    private String plate;

    private String brand;

    private String year;

    @OneToMany(mappedBy = "truck")
    private List<Note> notes;


}
