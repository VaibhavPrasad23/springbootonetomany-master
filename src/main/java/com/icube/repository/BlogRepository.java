package com.icube.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icube.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
