package com.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.model.Employee;
import com.springBoot.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
