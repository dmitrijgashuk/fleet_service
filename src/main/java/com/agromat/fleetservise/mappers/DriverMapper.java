package com.agromat.fleetservise.mappers;

import com.agromat.fleetservise.dto.DriverDTO;
import com.agromat.fleetservise.entity.Driver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    @Mapping(source = "phoneNumber", target = "phone")
    DriverDTO driverToDriverDTO(Driver driver);

    @Mapping(source = "phone", target = "phoneNumber")
    Driver driverDTOtoDriver(DriverDTO carDriverDto);
}
