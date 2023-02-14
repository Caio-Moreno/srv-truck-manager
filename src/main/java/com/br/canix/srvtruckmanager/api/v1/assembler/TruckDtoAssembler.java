package com.br.canix.srvtruckmanager.api.v1.assembler;

import com.br.canix.srvtruckmanager.api.v1.model.TruckDTO;
import com.br.canix.srvtruckmanager.domain.model.Truck;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class TruckDtoAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public TruckDTO toModel(Truck truck) {
        log.info(truck.getDescription());
        return modelMapper.map(truck, TruckDTO.class);
    }

    public List<TruckDTO> toCollectionModel(Collection<Truck> trucks) {
        return trucks.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}
