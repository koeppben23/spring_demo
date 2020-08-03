package com.adorsys.springdemo.service;

import com.adorsys.springdemo.entity.Employee;
import com.adorsys.springdemo.exception.CustomException;
import com.adorsys.springdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElseThrow(() -> new CustomException("Employee not found! " + id));
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {
        return repository.findById(id).map((oldEmployee) -> {
            oldEmployee.setName(employee.getName());
            oldEmployee.setCity(employee.getCity());
            oldEmployee.setHobby(employee.getHobby());
            return repository.save(oldEmployee);
        }).orElseGet(() -> {
            employee.setId(id);
            return repository.save(employee);
        });
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
