package com.rh.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rh.api.entities.EmployeeEntity;
import com.rh.api.services.EmployeeService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {
    
    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees(){
        return new ResponseEntity<>(employeeService.getAll(), HttpStatus.OK);        
    }

    @GetMapping("/employees/{id}")
    public Optional<EmployeeEntity> getById(@PathVariable Long id){
        return employeeService.getById(id);
    }
    
    @PostMapping("/employees")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        try{
            this.employeeService.createEmployee(employee);
        } catch (Exception e){
            System.out.print(e);
        }

        return employee;
    }
    
}
