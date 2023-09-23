package com.agromat.fleetservise.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "component")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String code;
    @ManyToOne
    @JoinColumn(name = "supplier")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "measurement")
    private UnitMeasurement measurement;

}
