package com.application.EmployeePayrollApp.service;

import java.util.List;

import com.application.EmployeePayrollApp.model.Employee;

/**
 * Interface to create methods to perform operations
 */
public interface InterfaceEmployeeservice {
    Employee addEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> deleteEmployeeById(Long id);
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployeeDetails();
}
