package com.application.EmployeePayrollApp.DTO;

public class EmployeePayrollDTO {
    public String name;
    public long salary;
    
    /**
     * Defining Constructor
     * @param name
     * @param salary
     */
    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
    /**
     * Overriding toString() Method
     */
    @Override
    public String toString() {
        return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
    }

    
}
