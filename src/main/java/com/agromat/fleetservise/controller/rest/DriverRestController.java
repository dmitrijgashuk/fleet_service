package com.agromat.fleetservise.controller.rest;

import com.agromat.fleetservise.dto.DriverDTO;
import com.agromat.fleetservise.repository.DriverRepository;
import com.agromat.fleetservise.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
@RequiredArgsConstructor
public class DriverRestController {
    private final DriverService driverService;

    @GetMapping("/{id}")
    public DriverDTO getDriverById(@PathVariable("id") long id){
        return driverService.fetchDriverById(id);
    }

    @PostMapping
    public DriverDTO addNewDriver(@RequestBody DriverDTO driverDTO){
        return driverService.createDriver(driverDTO);
    }

}
