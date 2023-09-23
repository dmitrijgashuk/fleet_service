package com.agromat.fleetservise.controller.ui;

import com.agromat.fleetservise.service.CarComponentService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComponentUIController {
    private final CarComponentService componentService;

    public ComponentUIController(CarComponentService componentService) {
        this.componentService = componentService;
    }

    @GetMapping("/components")
    String getAllComponent(Model model){
        return "";
    }
}
