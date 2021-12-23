package com.application.EmployeePayrollApp.controller;

import com.application.EmployeePayrollApp.DTO.EmployeePayrollDTO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/EmployeeDetails/")
public class EmployeePayrollControllerHttpController {
    /**
     * API for getting all Details of Employee
     * @return : ResonseEntity of EmployeeDetails
     */
    @RequestMapping("/get")
    public ResponseEntity<String> getEmployeeDetails(){
        return new ResponseEntity<String>("Get Call Success ",HttpStatus.OK);
    }

    /**
     * API for Getting get Employee Details by Employee ID
     * @param empID
     * @return ResponseEntity of Employee Details of given ID
     */
    @GetMapping("/get/{empID}")
    public ResponseEntity<String> getEmployeeDetails(@PathVariable("empID") int empID){
        return new ResponseEntity<String>("Get Call Success for Id : " +empID,HttpStatus.OK);
        
    }

    /**
     * API for Entering Employee Details in Response Entity
     * @param employeePayrollDTO
     * @return : ResponseEntity of Employee Details Data
     */
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeeDetails(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("Created Employee Payroll Data for " +employeePayrollDTO,HttpStatus.OK);
    }

    /**
     * API for Updating Details of Employee
     * @param employeePayrollDTO
     * @return : ResponseEntity of Updated Employee Details Data
     */
    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeeDetails(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("Updated Employee Payroll Data for : "+employeePayrollDTO,HttpStatus.OK);
    }

    /**
     * API for Deleteing Employee by ID
     * @param empId
     * @return :ResponseEntity
     */
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeeDetails(@PathVariable("empId") int empId){
        return new ResponseEntity<String>("Delete Call Success for ID : "+empId,HttpStatus.OK);
    }
}