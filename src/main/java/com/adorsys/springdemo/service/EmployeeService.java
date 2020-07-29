package com.adorsys.springdemo.service;

import com.adorsys.springdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployees();

    public Employee getEmployeeById(Long id);

    public Employee createEmployee(Employee employee);

    public Employee updateEmployee(Employee employee, Long id);

    public void deleteEmployee(Long id);
}
