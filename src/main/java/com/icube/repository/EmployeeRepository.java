package com.icube.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icube.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
