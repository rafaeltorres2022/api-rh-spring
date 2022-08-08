package com.rh.api.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rh.api.Entities.EmployeeEntity;
import com.rh.api.Repository.EmployeeRepo;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    
    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees(@RequestParam(required = false) String name){
        try{
            List<EmployeeEntity> employees = new ArrayList<>();

            if (name == null){
                employeeRepo.findAll().forEach(employees::add);
            }

            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
