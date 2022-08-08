package com.rh.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rh.api.Entities.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>{
    
}
