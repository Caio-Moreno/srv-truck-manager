package com.br.canix.srvtruckmanager.api.v1.controller;

import com.br.canix.srvtruckmanager.domain.model.Truck;
import com.br.canix.srvtruckmanager.domain.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/truck")
public class TruckController {

    @Autowired
    private TruckService service;

    @GetMapping
    public List<Truck> getAll() {
        return service.getAll();
    }

    @GetMapping("/{truckId}")
    public Truck getById(@PathVariable Long truckId) {
        return service.getById(truckId);
    }

}
