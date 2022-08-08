package com.rh.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rh.api.Entities.ProjectEntity;

public interface ProjectRepo extends JpaRepository<ProjectEntity, Long>{
    
}
