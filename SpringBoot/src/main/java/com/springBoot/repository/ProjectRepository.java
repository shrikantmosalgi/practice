package com.springBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springBoot.model.Employee;
import com.springBoot.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

	@Query(value="select * from project p where p.project_id in (:projectIds)",nativeQuery=true)
	public List<Project> getProjectsById(@Param("projectIds") List<Integer> projectIds);
}
