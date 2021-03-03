package com.xcollabs.schoolms.service.interfaces;

import com.xcollabs.schoolms.entities.Course;
import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourse(int id);
    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(int id);
}
