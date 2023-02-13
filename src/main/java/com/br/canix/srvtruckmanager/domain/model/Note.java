package com.br.canix.srvtruckmanager.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "note")
    private List<Information> information;

    @ManyToOne
    @JoinColumn(name = "truck_id", nullable = false)
    private Truck truck;

    private Date date;


}
