package com.Immaginnovate.Interview.bhaskara.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table(name="Employee")
@ToString
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "employeeId",nullable = false)
    private String employeeId;
    
    @Column(name = "firstName",nullable = false)
    private String firstName;
    
    @Column(name = "lastName",nullable = false)
    private String lastName;
    
    @Column(name = "email",nullable = false)
    private String email;
    
    @Column(name = "phoneNumbers",nullable = false)
    private Long phoneNumbers;
    
    @Column(name = "dateOfBirth",nullable = false)
    private String dateOfBirth;
    
    @Column(name = "salary",nullable = false)
    private BigDecimal salary;
    
    public EmployeeDetails() {

    }

    public EmployeeDetails(Long id, String employeeId, String firstName, String lastName, String email, long phoneNumbers,
			String dateOfBirth, BigDecimal salary) {
    	this.id = id;
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}

	// Getters and Setters
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Long phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
}
