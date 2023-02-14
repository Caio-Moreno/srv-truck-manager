package com.br.canix.srvtruckmanager.domain.service;


import com.br.canix.srvtruckmanager.domain.model.Note;

public interface NoteService {

    void addNote(Note note);

    void removeNote(Long noteId);

}
