package com.agromat.fleetservise.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {
 //(Long id, String firstName, String lastName, String phone)
    private Long id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String phone;

}

