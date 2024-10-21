package com.gtasterix.Employee.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Employee_Information")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emp_Id;

    private String first_Name;
    private String last_Name;
    private String education;
    private long mobileNumber;
    private String designation;
    private String house_Name;
    private String street_Name;
    private String city;
    private String state;
    private int pincode;

}
