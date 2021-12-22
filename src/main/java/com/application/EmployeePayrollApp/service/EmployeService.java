package com.application.EmployeePayrollApp.service;

import java.util.List;
import com.application.EmployeePayrollApp.model.Employee;
import com.application.EmployeePayrollApp.repository.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Service : creating service layer
 * @Autowired : enabling automatic dependency Injection
 * @Override : Overriding implemented methods from interface
 */

@Service
public class EmployeService implements InterfaceEmployeeservice {

    @Autowired
    EmployeeDetailsRepository employeeDetailsRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDetailsRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeDetailsRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployeeDetails(){
        return employeeDetailsRepository.findAll();
    }

    @Override
    public List<Employee> deleteEmployeeById(Long id) {
        employeeDetailsRepository.deleteById(id);
        return employeeDetailsRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeDetailsRepository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setSalary(employee.getSalary());
        return employeeDetailsRepository.save(existingEmployee);
    } 
}
