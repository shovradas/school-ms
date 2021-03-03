package com.xcollabs.schoolms.service;

import com.xcollabs.schoolms.entities.Course;
import com.xcollabs.schoolms.repository.interfaces.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements com.xcollabs.schoolms.service.interfaces.CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();
        this.courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    @Override
    public Optional<Course> getCourse(int id){
        return this.courseRepository.findById(id);
    }

    @Override
    public void addCourse(Course course){
        this.courseRepository.save(course);
    }

    @Override
    public void updateCourse(Course course) {
        this.courseRepository.save(course);
    }

    @Override
    public void deleteCourse(int id){
        Optional<Course> course = this.courseRepository.findById(id);
        if(course.isPresent())
            this.courseRepository.delete(course.get());
    }
}
