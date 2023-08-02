package com.example.ejbexam.service;
import com.example.ejbexam.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    void save(Employee theEmployee);
}