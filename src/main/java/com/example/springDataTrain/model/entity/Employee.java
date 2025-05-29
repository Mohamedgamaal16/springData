package com.example.springDataTrain.model.entity;


import jakarta.persistence.*;
import lombok.*;


@Table(name = "employees")
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String LastName;
    private String firstName;
    private Double Salary;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;
}