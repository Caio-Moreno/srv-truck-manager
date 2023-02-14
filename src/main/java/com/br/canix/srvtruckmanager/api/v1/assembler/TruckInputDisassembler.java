package com.br.canix.srvtruckmanager.api.v1.assembler;

import com.br.canix.srvtruckmanager.api.v1.model.input.TruckInputDTO;
import com.br.canix.srvtruckmanager.domain.model.Truck;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TruckInputDisassembler {

    @Autowired
    private ModelMapper modelMapper;

    public Truck toDomainObject(TruckInputDTO truckInputDTO) {
        return modelMapper.map(truckInputDTO, Truck.class);
    }



}
