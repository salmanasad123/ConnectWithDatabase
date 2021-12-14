package com.example.ConnectWithDatabase.repository;

import com.example.ConnectWithDatabase.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    public Employee findBySalary(Integer salary);

    @Query(value = "Select * from employee where emp_id = 1", nativeQuery=true)
    public Employee findEmployeeWithSecondHighestSalary();
}
