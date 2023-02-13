package com.br.canix.srvtruckmanager.domain.service;

import com.br.canix.srvtruckmanager.domain.model.Truck;

import java.util.List;

public interface TruckService {

    List<Truck> getAll();

    Truck getById(Long id);

}
