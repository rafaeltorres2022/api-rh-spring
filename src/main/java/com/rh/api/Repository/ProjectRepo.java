package com.rh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rh.api.entities.ProjectEntity;

public interface ProjectRepo extends JpaRepository<ProjectEntity, Long>{
    
}
