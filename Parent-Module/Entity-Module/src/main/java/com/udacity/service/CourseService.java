package com.udacity.service;

import com.udacity.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class CourseService  {
    @Autowired
    Repository repository;
}
