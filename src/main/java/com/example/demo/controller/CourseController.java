package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.CourseDTO;
import com.example.demo.exception.WrongIdException;
import com.example.demo.persistence.model.Course;
import com.example.demo.persistence.model.CourseRepo;
import com.example.demo.service.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    CourseRepo courseRepo;


    private List<CourseDTO> courseList = new ArrayList<>();

    @PostMapping(value = "/create")
    public ResponseEntity<CourseDTO> createCurser(@RequestBody CourseDTO course) {

        if (course.getId() == null || course.getId() < 0)
            throw new WrongIdException("Id jest mniejsze od 0 lub równa się null");

        courseList.add(course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

    @GetMapping(value = "/avaliable")
    public ResponseEntity<List<CourseDTO>> getAvaliable() {
        return new ResponseEntity<>(courseList, HttpStatus.OK);
    }

    @GetMapping(value = "/buy1/{id}")
    public CourseDTO buy1(@PathVariable(value = "id") Long id) {
        System.out.println("Buy course");
        Course c = courseRepo.getOne(id);
        return Mapper.courseToDTO(c);
    }

    @PostMapping("/buy2")
    public CourseDTO buy2(@RequestParam("id") Long id) {
        System.out.println("Buy course");
        return getCourse(id);
    }


    private CourseDTO getCourse(Long id) {
        System.out.println("Buy course");
        CourseDTO course = null;


        for (CourseDTO c : courseList) {
            if (c.getId().equals(id)) {
                course = c;
            }


        }

        return course;
    }


}
