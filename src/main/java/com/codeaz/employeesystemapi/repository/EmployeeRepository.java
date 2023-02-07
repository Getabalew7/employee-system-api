package com.codeaz.employeesystemapi.repository;

import com.codeaz.employeesystemapi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository <Employee, Long> {
}
