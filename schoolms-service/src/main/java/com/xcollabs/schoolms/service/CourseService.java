package com.xcollabs.schoolms.service;

import com.xcollabs.schoolms.entities.Course;
import java.util.Optional;

public interface CourseService extends Service<Course> {
    Optional<Course> getByCode(String code);
}
