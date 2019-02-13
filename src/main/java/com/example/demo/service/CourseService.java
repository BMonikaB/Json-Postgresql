package com.example.demo.service;

import com.example.demo.domain.CourseDTO;
import com.example.demo.persistence.model.Course;
import com.example.demo.persistence.repository.CourseRepo;
import org.springframework.stereotype.Controller;

import java.util.List;


public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();
}