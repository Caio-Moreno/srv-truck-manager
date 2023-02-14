package com.br.canix.srvtruckmanager.domain.service.impl;

import com.br.canix.srvtruckmanager.domain.exception.BusinessException;
import com.br.canix.srvtruckmanager.domain.model.Note;
import com.br.canix.srvtruckmanager.domain.repository.NoteRepository;
import com.br.canix.srvtruckmanager.domain.service.NoteService;
import com.br.canix.srvtruckmanager.domain.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository repo;

    @Autowired
    private TruckService truckService;

    @Transactional
    @Override
    public void addNote(Note note) {
        var truck = truckService.getById(note.getTruck().getId());
        note.setTruck(truck);
        repo.save(note);
    }

    @Transactional
    @Override
    public void removeNote(Long noteId) {
        try {
            repo.deleteById(noteId);
        } catch (EmptyResultDataAccessException e) {
            throw new BusinessException(e.getMessage(), e);
        }
    }
}
