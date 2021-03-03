package com.xcollabs.schoolms.repository.interfaces;

import com.xcollabs.schoolms.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
}