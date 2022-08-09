package com.rh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rh.api.entities.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>{
    
}
