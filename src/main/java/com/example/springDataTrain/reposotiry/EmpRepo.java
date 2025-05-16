package com.example.springDataTrain.reposotiry;

import com.example.springDataTrain.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
}
