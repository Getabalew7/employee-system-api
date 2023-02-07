package com.codeaz.employeesystemapi.service;

import com.codeaz.employeesystemapi.Entity.Employee;
import com.codeaz.employeesystemapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements   EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> createEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public Employee deleteEmployee(int id) {
        Employee employee = employeeRepository.findById( (long)id).get();
        employeeRepository.delete(employee);
        return employee;
    }
    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee updatedEmployee = employeeRepository.findById(id).get();
        updatedEmployee.setFirstName(employee.getFirstName());
        updatedEmployee.setLastName(employee.getLastName());
        updatedEmployee.setEmail(employee.getEmail());
       return employeeRepository.save(updatedEmployee);
    }


}
