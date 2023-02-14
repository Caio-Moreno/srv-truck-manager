package com.br.canix.srvtruckmanager.api.v1.controller;

import com.br.canix.srvtruckmanager.api.v1.assembler.NoteDtoAssembler;
import com.br.canix.srvtruckmanager.api.v1.model.NoteDTO;
import com.br.canix.srvtruckmanager.domain.model.Note;
import com.br.canix.srvtruckmanager.domain.service.NoteService;
import com.br.canix.srvtruckmanager.domain.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/truck/{idTruck}/note")
public class NoteController {

    @Autowired
    private TruckService truckService;

    @Autowired
    private NoteService service;

    @Autowired
    private NoteDtoAssembler assembler;

    @GetMapping
    public List<NoteDTO> getAllByTruck(@PathVariable Long idTruck) {
        var truck = truckService.getById(idTruck);

        return assembler.toCollectionModel(truck.getNotes());
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void insert(@PathVariable Long idTruck, @RequestBody Note note) {
        service.addNote(idTruck, note);
    }


}
