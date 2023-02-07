package com.codeaz.employeesystemapi.service;

import com.codeaz.employeesystemapi.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);

    public List<Employee> createEmployees(List<Employee> employees);

   public  List<Employee> getAllEmployees();

   public Employee  deleteEmployee(int id);

    public Employee getEmployeeById(long id);

    Employee updateEmployee(Employee employee, long id);
}
