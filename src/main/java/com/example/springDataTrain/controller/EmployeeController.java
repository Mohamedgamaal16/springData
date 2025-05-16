package com.example.springDataTrain.controller;

import com.example.springDataTrain.model.dto.EmployeeDTO;
import com.example.springDataTrain.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmpService empService;

    @GetMapping("/get-emp")
    public EmployeeDTO getEmp(@RequestParam("id") Integer id) {
        return empService.getUser(id);
    }

    @GetMapping("/get-allemp")
    public List<EmployeeDTO> getAllEmp() {
        return empService.getAllUser();
    }

    @PostMapping("/save-emp")
    public EmployeeDTO saveEmp(@RequestBody EmployeeDTO employeeDTO) {
        return empService.saveUser(employeeDTO);
    }

    @DeleteMapping("/delete-emp")
    public String deleteEmp(@RequestParam Integer id) {
        empService.deleteUser(id);
        return "User with id " + id + " is deleted successfully";
    }

    @PutMapping("/update-emp")
    public EmployeeDTO updateEmp(@RequestParam Integer id, @RequestBody EmployeeDTO employeeDTO) {
        return empService.updateUser(id, employeeDTO);
    }

}
