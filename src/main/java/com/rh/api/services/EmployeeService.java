package com.rh.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rh.api.entities.EmployeeEntity;
import com.rh.api.repository.EmployeeRepo;

import lombok.RequiredArgsConstructor;

/**
 * EmployeeService
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public List<EmployeeEntity> getAll(){
        return employeeRepo.findAll();
    }

    public Optional<EmployeeEntity> getById(Long id){
        return employeeRepo.findById(id);
    }

    public EmployeeEntity createEmployee(EmployeeEntity employee){

        EmployeeEntity e = new EmployeeEntity();
        e.setName(employee.getName());

        return employeeRepo.save(e);
    }
}