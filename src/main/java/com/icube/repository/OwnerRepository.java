package com.icube.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icube.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
}
