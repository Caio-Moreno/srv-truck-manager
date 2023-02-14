package com.br.canix.srvtruckmanager.domain.repository;

import com.br.canix.srvtruckmanager.domain.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Long> {

    Optional<List<Note>> findByTruck(Long truckId);

}
