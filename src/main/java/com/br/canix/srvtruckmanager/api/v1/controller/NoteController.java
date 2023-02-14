package com.br.canix.srvtruckmanager.api.v1.controller;

import com.br.canix.srvtruckmanager.api.v1.assembler.NoteDtoAssembler;
import com.br.canix.srvtruckmanager.domain.model.Note;
import com.br.canix.srvtruckmanager.domain.service.NoteService;
import com.br.canix.srvtruckmanager.domain.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/note")
public class NoteController {

    @Autowired
    private TruckService truckService;

    @Autowired
    private NoteService service;

    @Autowired
    private NoteDtoAssembler assembler;


    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void insert(@RequestBody Note note) {
        service.addNote(note);
    }

    @DeleteMapping("/{idNote}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long idNote) {
        service.removeNote(idNote);
    }


}
