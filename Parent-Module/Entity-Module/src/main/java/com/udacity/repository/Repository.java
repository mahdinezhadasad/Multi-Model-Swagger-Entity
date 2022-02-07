package com.udacity.repository;

import com.udacity.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Repository extends JpaRepository<Course,Long> {
    @Override
    Optional<Course> findById(Long aLong);

    List<Course> findAllByTitle(String title);
}
