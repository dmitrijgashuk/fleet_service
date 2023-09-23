package com.agromat.fleetservise.repository;

import com.agromat.fleetservise.entity.CarComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarComponentRepository extends JpaRepository<CarComponent,Long> {
}
