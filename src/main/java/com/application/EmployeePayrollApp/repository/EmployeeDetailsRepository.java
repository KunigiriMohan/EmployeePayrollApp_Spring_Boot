package com.application.EmployeePayrollApp.repository;

import com.application.EmployeePayrollApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * Interface extending JpaRepository to transfer files to Database
 */
public interface EmployeeDetailsRepository extends JpaRepository<Employee,Long>{
    
}
