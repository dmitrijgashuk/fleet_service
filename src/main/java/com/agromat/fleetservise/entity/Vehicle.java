package com.agromat.fleetservise.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicle")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "brand")
    private CarBrand brand;
    @Column(name = "model")
    private String model;
    @Column(name = "registration_number")
    private String registrationNumber;
    @OneToOne
    @JoinColumn(name = "current_driver")
    private Driver currentDriver;
    @OneToOne
    @JoinColumn(name = "replacement_driver")
    private Driver replacementDriver;
    @ManyToOne
    @JoinColumn(name = "type")
    private VehicleType type;

}
