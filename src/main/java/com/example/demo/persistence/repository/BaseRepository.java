package com.example.demo.persistence.repository;

import com.example.demo.persistence.model.BaseEntity;
import com.example.demo.persistence.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;
public interface BaseRepository<T extends BaseEntity, K extends Serializable>
        extends JpaRepository<T, K>, JpaSpecificationExecutor<T> {
}

