package com.agromat.fleetservise.dto;

import com.agromat.fleetservise.entity.Supplier;
import com.agromat.fleetservise.entity.UnitMeasurement;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarComponentDTO {
    private Long id;
    private String description;
    private String code;
    private Supplier supplier;
    private UnitMeasurement measurement;

}
