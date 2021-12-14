package com.example.ConnectWithDatabase.services;

import com.example.ConnectWithDatabase.entities.Employee;
import com.example.ConnectWithDatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployee(Integer id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            return employeeOptional.get();
        } else {
            return null;
        }
    }

    public Employee findEmployeeWithSecondHighestSalary() {
        return employeeRepository.findEmployeeWithSecondHighestSalary();
    }
}
