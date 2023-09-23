package com.agromat.fleetservise.service;

import com.agromat.fleetservise.dto.DriverDTO;
import com.agromat.fleetservise.entity.Driver;
import com.agromat.fleetservise.mappers.DriverMapper;
import com.agromat.fleetservise.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Controller
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepository repository;
    private final DriverMapper driverMapper;

    public List<DriverDTO> getAllDriver(Pageable pageable){
        return repository.findAll(pageable).stream()
                .map(d -> driverMapper.driverToDriverDTO(d))
                .collect(Collectors.toList());
    }

    public DriverDTO createDriver(DriverDTO driverDTO) {
        Driver newDriver = driverMapper.driverDTOtoDriver(driverDTO);
        Driver saveDriver = repository.save(newDriver);
        return driverMapper.driverToDriverDTO(saveDriver);
    }

    public DriverDTO fetchDriverById(long id) {
        Driver driver = repository.findById(id).orElseThrow();
        return driverMapper.driverToDriverDTO(driver);
    }

}
