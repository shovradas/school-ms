package com.xcollabs.schoolms.infrastructure.data.jpa;

import com.xcollabs.schoolms.data.CourseRepository;
import com.xcollabs.schoolms.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepositoryJpa extends CrudRepository<Course, Integer> {}

