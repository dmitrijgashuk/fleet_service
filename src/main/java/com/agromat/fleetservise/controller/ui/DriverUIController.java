package com.agromat.fleetservise.controller.ui;

import com.agromat.fleetservise.dto.DriverDTO;
import com.agromat.fleetservise.repository.DriverRepository;
import com.agromat.fleetservise.service.DriverService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DriverUIController {
    public final DriverService driverService;

    public DriverUIController(DriverRepository repository, DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("/drivers")
    public String showDriverList(Model model, Pageable pageable){
        return "";
    }

    @GetMapping("/drivers/{id}")
    public String showDriver(@PathVariable String id, Model model){
        return "";
    }

    @PostMapping("/drivers")
    public String createDriver(DriverDTO driverDTO, Model model){
        DriverDTO driverObject = new DriverDTO();
        if(driverDTO == null){
           model.addAttribute("driver",driverObject);
            return "drivers/new-driver-form";
        }
        driverService.createDriver(driverDTO);
        return "redirect:drivers";
    }

    @DeleteMapping("/drivers/{id}")
    public String removeDriver(@PathVariable String id){
        return "";

    }

}
