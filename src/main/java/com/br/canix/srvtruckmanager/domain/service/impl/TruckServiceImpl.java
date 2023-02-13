package com.br.canix.srvtruckmanager.domain.service.impl;

import com.br.canix.srvtruckmanager.domain.exception.TruckNotFoundException;
import com.br.canix.srvtruckmanager.domain.model.Truck;
import com.br.canix.srvtruckmanager.domain.repository.TruckRepository;
import com.br.canix.srvtruckmanager.domain.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    private TruckRepository repo;

    @Override
    public List<Truck> getAll() {
        return repo.findAll();
    }

    @Override
    public Truck getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new TruckNotFoundException(id));
    }
}
