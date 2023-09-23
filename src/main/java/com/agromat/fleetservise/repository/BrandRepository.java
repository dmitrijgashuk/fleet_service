package com.agromat.fleetservise.repository;

import com.agromat.fleetservise.entity.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<CarBrand,Long> {

}
