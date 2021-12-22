package com.application.EmployeePayrollApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @Entity : Defining class mapped to tabel
 * @Table : Definign Table Name
 */
@Entity
@Table(name ="Employee_Tables")
public class Employee {
	@Id
	@GeneratedValue
	private long id;
    private String name;
    private Long salary;

	/**
	 * Defining Constructer
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employee(long id,String name,Long salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public Employee(){}

    /**
	 * Getters and setters of variables
	 */
	public String getName() {
		return name;
	}

	public Long getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(Long salary) {
		this.salary=salary;
	}
	public long getId() {
        return id;
    }
	public void setId(long id) {
        this.id = id;
    }
}
