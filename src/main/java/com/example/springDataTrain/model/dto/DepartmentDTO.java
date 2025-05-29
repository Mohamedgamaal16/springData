package com.example.springDataTrain.model.dto;

import com.example.springDataTrain.model.entity.Department;
import com.example.springDataTrain.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {

    private Integer id;
    private String name;


    public static DepartmentDTO toDTO(Department department) {
        return DepartmentDTO.builder()
                .id(department.getId())
                .name(department.getName())
                .build();
    }

    public static Department toEntity(DepartmentDTO dto) {
        return Department.builder()
                .id(dto.getId())
                .name(dto.toString())

                .build();
    }
}
