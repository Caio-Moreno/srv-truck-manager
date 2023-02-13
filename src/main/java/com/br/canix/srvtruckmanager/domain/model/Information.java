package com.br.canix.srvtruckmanager.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne
    @JoinColumn(name = "note_id", nullable = false)
    private Note note;

}
