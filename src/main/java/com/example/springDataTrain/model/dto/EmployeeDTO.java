package com.example.springDataTrain.model.dto;

import com.example.springDataTrain.model.entity.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Integer id;
    private String LastName;
    private String firstName;
    private Double Salary;


    public static EmployeeDTO toDTO(Employee employee) {
        return EmployeeDTO.builder()
                .id(employee.getId())
                .LastName(employee.getLastName())
                .firstName(employee.getFirstName())
                .Salary(employee.getSalary())
                .build();
    }

    public static Employee toEntity(EmployeeDTO dto) {
        return Employee.builder()
                .id(dto.getId())
                .LastName(dto.getLastName())
                .firstName(dto.getFirstName())
                .Salary(dto.getSalary())
                .build();
    }
}

