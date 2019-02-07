package com.example.demo.service;

import java.util.List;

public interface CourseService<T> extends BaseService {

    public List<T> getBought();

    public T buyCourse(int id);
}
