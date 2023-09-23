package com.agromat.fleetservise.repository;

import com.agromat.fleetservise.dto.DriverDTO;
import com.agromat.fleetservise.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {

}
