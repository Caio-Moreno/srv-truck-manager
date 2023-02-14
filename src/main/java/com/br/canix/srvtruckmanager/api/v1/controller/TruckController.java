package com.br.canix.srvtruckmanager.api.v1.controller;

import com.br.canix.srvtruckmanager.api.v1.assembler.NoteDtoAssembler;
import com.br.canix.srvtruckmanager.api.v1.assembler.TruckDtoAssembler;
import com.br.canix.srvtruckmanager.api.v1.assembler.TruckInputDisassembler;
import com.br.canix.srvtruckmanager.api.v1.model.NoteDTO;
import com.br.canix.srvtruckmanager.api.v1.model.TruckDTO;
import com.br.canix.srvtruckmanager.api.v1.model.input.TruckInputDTO;
import com.br.canix.srvtruckmanager.domain.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/truck")
public class TruckController {

    @Autowired
    private TruckService service;

    @Autowired
    private TruckInputDisassembler truckInputDisassembler;

    @Autowired
    private TruckDtoAssembler truckDtoAssembler;

    @Autowired
    private NoteDtoAssembler noteDtoAssembler;


    @GetMapping
    public List<TruckDTO> getAll() {
        return truckDtoAssembler.toCollectionModel(service.getAll());
    }

    @GetMapping("/{truckId}")
    public TruckDTO getById(@PathVariable Long truckId) {
        return truckDtoAssembler.toModel(service.getById(truckId));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TruckDTO insert(@RequestBody TruckInputDTO truckInputDTO) {
        var truck = truckInputDisassembler.toDomainObject(truckInputDTO);

        return truckDtoAssembler.toModel(service.save(truck));
    }

    @GetMapping("/{idTruck}/note")
    public List<NoteDTO> getAllByTruck(@PathVariable Long idTruck) {
        var truck = service.getById(idTruck);

        return noteDtoAssembler.toCollectionModel(truck.getNotes());
    }

}
