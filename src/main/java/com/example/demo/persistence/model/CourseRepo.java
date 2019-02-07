package com.example.demo.persistence.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRepo extends JpaRepository<Course,Long>, JpaSpecificationExecutor<Course> {
}
