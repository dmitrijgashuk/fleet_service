package com.agromat.fleetservise.dto;

import com.agromat.fleetservise.entity.CarComponent;
import com.agromat.fleetservise.entity.Vehicle;
import lombok.Data;

@Data
public class RepairSheetCreationDTO {
    private Vehicle vehicle;
    private CarComponent component;
    private Integer amount;

}
