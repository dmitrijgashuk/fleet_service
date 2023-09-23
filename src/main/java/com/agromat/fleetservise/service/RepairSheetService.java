package com.agromat.fleetservise.service;

import com.agromat.fleetservise.entity.RepairSheet;
import com.agromat.fleetservise.repository.RepairsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RepairSheetService {
    private final RepairsRepository repository;

    public List<RepairSheet> allRepairList(){
        return repository.findAll();
    }
    
    public void createAndSaveRepairSheet(RepairSheet repairSheet){
        repository.save(repairSheet);
    }

}
