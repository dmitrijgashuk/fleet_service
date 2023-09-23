package com.agromat.fleetservise.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicle_type")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleType {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

}
