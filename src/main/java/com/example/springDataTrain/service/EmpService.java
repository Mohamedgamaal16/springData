package com.example.springDataTrain.service;

import com.example.springDataTrain.model.dto.EmployeeDTO;
import com.example.springDataTrain.model.entity.Employee;
import com.example.springDataTrain.reposotiry.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmpService {


    @Autowired
    private EmpRepo empRepo;

    public EmployeeDTO getUser(Integer id) {
        Optional<Employee> emp = this.empRepo.findById(id);
        return emp.map(EmployeeDTO::toDTO).orElse(null);
    }

    public List<EmployeeDTO> getAllUser() {
        List<Employee> empList = this.empRepo.findAll();
        return empList.stream()
                .map(EmployeeDTO::toDTO)
                .collect(Collectors.toList());
    }

    public EmployeeDTO saveUser(EmployeeDTO employeeDTO) {
        Employee saved = this.empRepo.save(EmployeeDTO.toEntity(employeeDTO));
        return EmployeeDTO.toDTO(saved);
    }

    public void deleteUser(int id) {
        empRepo.deleteById(id);
    }

    public EmployeeDTO updateUser(Integer id, EmployeeDTO employeeDTO) {
        Optional<Employee> existing = empRepo.findById(id);

        if (existing.isPresent()) {
            Employee employee = existing.get();
            employee.setFirstName(employeeDTO.getFirstName());
            employee.setLastName(employeeDTO.getLastName());
            employee.setSalary(employeeDTO.getSalary());

            Employee updated = empRepo.save(employee);
            return EmployeeDTO.toDTO(updated);
        }

        return null;
    }

}
