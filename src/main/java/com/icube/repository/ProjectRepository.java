package com.icube.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icube.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
