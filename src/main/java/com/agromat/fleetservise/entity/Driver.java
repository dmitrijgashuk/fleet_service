package com.agromat.fleetservise.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "driver")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "father_name")
    private String fatherName;
    @Column (name = "phone")
    private String phoneNumber;
    @CreationTimestamp
    @Column(name = "create_date")
    private LocalDateTime createTime;
    @UpdateTimestamp
    @Column(name = "update_date")
    private LocalDateTime updateTime;

}
