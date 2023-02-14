package com.br.canix.srvtruckmanager.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "truck", fetch = FetchType.LAZY)
    private List<Note> notes = new ArrayList<>();

    public boolean addNote(Note note) {
        return this.notes.add(note);
    }


}
