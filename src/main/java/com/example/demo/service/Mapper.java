package com.example.demo.service;

import com.example.demo.domain.CourseDTO;
import com.example.demo.persistence.model.Course;

public class Mapper {


    public static CourseDTO courseToDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setName(course.getName());
        courseDTO.setLenghtInSecond(0);
        return courseDTO;
    }

    public static Course dTOtoCourse(CourseDTO courseDTO){
        Course course = new Course();
        course.setId(courseDTO.getId());
        course.setName(courseDTO.getName());

        return course;
    }

}
