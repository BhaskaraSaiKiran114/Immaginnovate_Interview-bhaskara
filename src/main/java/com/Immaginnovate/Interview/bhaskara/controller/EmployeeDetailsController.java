package com.Immaginnovate.Interview.bhaskara.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Immaginnovate.Interview.bhaskara.model.EmployeeDetails;
import com.Immaginnovate.Interview.bhaskara.repo.EmployeeRepository;

@RestController
@RequestMapping("/api/employees")
public class EmployeeDetailsController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<EmployeeDetails> getEmployeeById(@PathVariable Long empId) {
        Optional<EmployeeDetails> empObj = employeeRepository.findById(empId);
        if (empObj.isPresent()) {
            return new ResponseEntity<>(empObj.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeDetails> addEmployee(@RequestBody EmployeeDetails book) {
        try {
        	EmployeeDetails empObj = employeeRepository.save(book);
            return new ResponseEntity<>(empObj, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
