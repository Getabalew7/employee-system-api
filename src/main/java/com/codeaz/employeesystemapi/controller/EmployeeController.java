package com.codeaz.employeesystemapi.controller;

import com.codeaz.employeesystemapi.Entity.Employee;
import com.codeaz.employeesystemapi.service.EmployeeService;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
    @PostMapping("/employees")
    public List<Employee> createEmployees(@RequestBody List<Employee> employees){
        return employeeService.createEmployees(employees);
    }
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/employee/{id}")
   public ResponseEntity<Employee> deleteEmployee(@PathVariable int id){

        return ResponseEntity.ok(employeeService.deleteEmployee(id));

   }
   @GetMapping("/employee/{id}")
   public ResponseEntity<Employee> getEmpoyee(@PathVariable long id){

      return ResponseEntity.ok(employeeService.getEmployeeById(id));
   }
   @PutMapping("/employee/{id}")
  public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable long id){
        return ResponseEntity.ok(employeeService.updateEmployee(employee,id));
  }
}
