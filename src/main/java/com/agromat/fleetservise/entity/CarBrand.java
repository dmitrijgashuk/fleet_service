package com.agromat.fleetservise.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_brand")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;

}
