package com.agromat.fleetservise.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "measurement")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnitMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "unit_name")
    private String unitName;
    @Column(name = "unit_sign")
    private String unitSign;

}
