package com.example.ConnectWithDatabase.controllers;

import com.example.ConnectWithDatabase.entities.Employee;
import com.example.ConnectWithDatabase.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getSingleEmployee/{empId}")
    public Employee getEmployee(@PathVariable Integer empId) {
        return employeeService.getEmployee(empId);
    }

    @GetMapping("/getEmployeeWithSecondHighestSalary")
    public Employee getEmployeeWithSecondHighestSalary() {
        return employeeService.findEmployeeWithSecondHighestSalary();
    }

}
