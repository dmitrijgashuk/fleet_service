package com.agromat.fleetservise.dto;

import com.agromat.fleetservise.entity.CarComponent;
import com.agromat.fleetservise.entity.UnitMeasurement;
import com.agromat.fleetservise.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RepairTo {
    private Long id;
    private LocalDateTime repairDate;
    private Vehicle vehicle;
    private CarComponent component;
    private Integer amount;

}
