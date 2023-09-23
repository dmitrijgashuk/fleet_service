package com.agromat.fleetservise.mappers;

import com.agromat.fleetservise.dto.CarComponentDTO;
import com.agromat.fleetservise.entity.CarComponent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarComponentMapper {
    CarComponentDTO carComponentToDTO(CarComponent component);
    CarComponent DTOToCarComponent(CarComponentDTO componentDTO);

}
