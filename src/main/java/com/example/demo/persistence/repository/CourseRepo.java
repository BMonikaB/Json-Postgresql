package com.example.demo.persistence.repository;

import com.example.demo.persistence.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRepo extends BaseRepository<Course, Long> {
}