package com.agromat.fleetservise.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "repair_sheet")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RepairSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "repair_date")
    private LocalDateTime repairDate;
    @ManyToOne
    @JoinColumn(name = "vehicle")
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name = "component")
    private CarComponent components;
    @Column(name = "amount", nullable = false)
    private Integer amount;

}
