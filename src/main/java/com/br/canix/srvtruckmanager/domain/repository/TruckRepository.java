package com.br.canix.srvtruckmanager.domain.repository;

import com.br.canix.srvtruckmanager.domain.model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
}
