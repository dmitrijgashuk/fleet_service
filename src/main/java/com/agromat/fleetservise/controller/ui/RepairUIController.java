package com.agromat.fleetservise.controller.ui;

import com.agromat.fleetservise.dto.RepairSheetCreationDTO;
import com.agromat.fleetservise.entity.RepairSheet;
import com.agromat.fleetservise.service.RepairSheetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/repairs")
@Controller
public class RepairUIController {
    private final RepairSheetService repairService;

    public RepairUIController(RepairSheetService repairService) {
        this.repairService = repairService;
    }

    @GetMapping("/list")
    public ModelAndView showRepairList(ModelAndView modelAndView){
        modelAndView.setViewName("/repairs/repair-list");
        List<RepairSheet> repairSheets = repairService.allRepairList();
        modelAndView.addObject("repairSheets", repairSheets);
        return modelAndView;
    }

    @GetMapping("/add-repair")
    public String addRepair(Model model){
        RepairSheetCreationDTO creationDTO = new RepairSheetCreationDTO();
        model.addAttribute("repairCreation",creationDTO);
        return "/repairs/add-repair";
    }

}
