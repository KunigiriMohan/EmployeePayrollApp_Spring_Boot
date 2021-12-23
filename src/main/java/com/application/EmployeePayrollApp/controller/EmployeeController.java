package com.application.EmployeePayrollApp.controller;

import java.util.List;

import com.application.EmployeePayrollApp.model.Employee;
import com.application.EmployeePayrollApp.service.InterfaceEmployeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController : Defining Class as a RestController
 * @RequestMapping : Defining path of URL
 * @PostMapping : Defining URL path of API and to perform POST operation
 * @GetMapping : Defining URL Path of API
 * @PutMapping : Defining URL Path of API which perform PUT operation
 * @DeleteMapping : Defining URL Path of API which perform DELETE opertion
 * @Autowired : Dependency Injection
 */


@RestController
@RequestMapping("/Employee/")
public class EmployeeController {

    @Autowired
    private InterfaceEmployeeservice employeeSerVice;
    
    
    /**
     * API Adding Employee Details
     * @param employee
     * @return
     */
    @PostMapping("/post")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeSerVice.addEmployee(employee);
    }
    
    
    /**
     * API for Getting Details by Id
     * @param Id
     * @return Employee
     */
    @GetMapping("/get/{Id}")
    public Employee getEmployee(@PathVariable Long Id){
        return employeeSerVice.getEmployeeById(Id);
    }
    
    
    /**
     * API for Getting All Employee Details
     * @return List<Employee>
     */
    @GetMapping("/get/allemployee")
    public List<Employee> getAllEmployee(){
        return employeeSerVice.getAllEmployeeDetails();
    }
    
    
    /**
     * API for updating Employee details in repository 
     */
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeSerVice.updateEmployee(employee);
    }
    
    
    /**
     * API for deleting Employee by Id
     * @param Id
     * @return List<Employee>
     */
    @DeleteMapping("/delete/{Id}")
    public List<Employee> deleteEmployee(@PathVariable Long Id){
        return employeeSerVice.deleteEmployeeById(Id);
    }
}
