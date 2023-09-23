package com.agromat.fleetservise.repository;

import com.agromat.fleetservise.entity.RepairSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairsRepository extends JpaRepository<RepairSheet,Long> {

}
